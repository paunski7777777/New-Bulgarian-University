'''
first = [int(n) for n in input().split()]
second = [char for char in input().split()]
'''
first = ([1,2,2])
second = ['b', 'a']

if all(first[i] <= first[i + 1] for i in range(len(first) - 1)):
    print("sorted")
else:
    print("unsorted")

if all(second[i] <= second[i + 1] for i in range(len(second) - 1)):
    print("unsorted")
else:
    print("unsorted")

