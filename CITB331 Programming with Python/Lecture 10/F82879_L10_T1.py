import sys

f = open(sys.argv[1], 'r')
f2 = open(sys.argv[2], 'w')

lines = sorted(f.readlines())

for line in lines:
    f2.write(line)

f.close()
f2.close()