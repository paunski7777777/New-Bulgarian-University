import sys

numbers = [30, 40, 50, 52, 56, 62, 70, 91, 100, 131, 132, 166, 170, 195, 202, 205, 212, 248, 249, 256, 263, 272, 288, 289, 290, 296, 332, 345, 352, 364, 380, 390, 407, 412, 429, 430, 438, 444, 486, 493, 497, 499, 510, 513, 514, 519, 521, 521, 535, 546, 552, 554, 556, 570, 584, 638, 640, 655, 655, 657, 692, 692, 711, 713, 731, 739, 740, 842, 858, 885, 887, 888, 893, 898, 900, 903, 908, 909, 959, 988]

def binarySearch(numbers, element, start = 0, end = None):
    if end is None:
        end = len(numbers) - 1

    if start > end:
        return "not found"

    middle = (start + end) // 2
    if element == numbers[middle]:
        return "found at " + str(middle)

    if element < numbers[middle]:
        return binarySearch(numbers, element, start, middle - 1)

    return binarySearch(numbers, element, middle + 1, end)

print(binarySearch(numbers, int(sys.argv[1])))