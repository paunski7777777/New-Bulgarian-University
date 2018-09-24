import re
text = open('all_people.csv', 'rb').read().decode('utf-8-sig').rstrip().replace('\\\n', '\\')
lines = text.split('\n')
columns = lines[0].split(',')
pattern = ','.join([r'(\".+\")'] + [r'(\"?.+\"?|\\N)' for c in range(len(columns)-1)])
regex = re.compile(pattern)
print(pattern)
matches = [(regex.match(line), line) for line in lines[1:]]
unsuccessful_matches = [line for match, line in matches if not match]
entities = [[match.group(c + 1).strip('"') for c in range(len(columns))] for match, line in matches]
print(*entities, sep='\n')