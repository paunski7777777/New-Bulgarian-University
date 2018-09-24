import string

text = input()

count = 0
alphabet = string.ascii_lowercase
histogram = {}

for i in text:
    for j in alphabet:
        if i == j:
            histogram[i] = histogram.get(j, count) + 1

print(histogram)