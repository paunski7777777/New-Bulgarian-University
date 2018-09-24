d = {1: 'a', 2: 'b', 3: 'c', 4: 'a', 5: 'd', 6: 'e', 7: 'a', 8: 'b'}

value = input()

keys = [k for k, v in d.items() if v == value]

print(keys)