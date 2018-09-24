import sys

def powNumbers(x, y):
    if y == 0:
        return 1
    if y >= 1:
        return x * powNumbers(x, y - 1)

print(powNumbers(int(sys.argv[1]), int(sys.argv[2])))