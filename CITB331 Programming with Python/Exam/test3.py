import re

text = open('all_casts.csv', 'rb').read().decode('utf-8-sig').rstrip().replace('\\\n', '\\')

lines = text.split('\n')

columns = lines[0].split(',')

pattern = ','.join([r'(\".+\")'] + [r'(\"?.+\"?|\\N)' for c in range(len(columns)-1)])
regex = re.compile(pattern)

print(pattern)

for line in lines[1:]:
    match = regex.match(line)
    entity = [match.group(c + 1).strip('"') for c in range(len(columns))]
    entity_dict = {key.strip('\"'): value for key, value in zip(columns, entity)}

    print(entity_dict)