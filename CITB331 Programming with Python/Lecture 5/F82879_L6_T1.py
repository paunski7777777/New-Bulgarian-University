import sys

def fibonacci(start, end):
    f0 = 1
    f1 = 1
    fiboacciNumbers = [0,1,1]

    for i in range(end):
        fNext = f0 + f1
        f0 = f1
        f1 = fNext
        fiboacciNumbers.append(f1)

    result = []

    for i in range(start - 1, end):
        result.append(fiboacciNumbers[i])
    return result

print(fibonacci(int(sys.argv[1]),int(sys.argv[2])))