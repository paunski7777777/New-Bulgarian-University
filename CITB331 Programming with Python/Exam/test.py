import re

text = open('all_casts.csv', 'rb').read().decode('utf-8-sig').rstrip()

text = text.replace('\\\n', '\\')

lines = text.split('\n')

columns = lines[0].split(',')

# regex = re.compile(r'\"(?P<id>\d+)\",\"(?P<name>.+?)\",\"?(?P<birth_date>(?:\d{4}-\d{2}-\d{2})|(?:\\N))\"?,\"?(?P<death_date>(?:(\d{4}-\d{2}-\d{2}))|\\N)\"?,\"?(?P<gender>\d|\\N)\"?')
pattern = ','.join([r'(\".+\")'] + [r'(\"?.+\"?|\\N)' for c in range(len(columns)-1)])
regex = re.compile(pattern)

print(pattern)

matches = [regex.match(line) for line in lines[1:]]

entities = [[match.group(c + 1).strip('"') for c in range(len(columns))] for match in matches]

entities_dict = [{key.strip('\"'): value for key, value in zip(columns, entity)} for entity in entities]

print(entities_dict)