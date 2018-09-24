import string

text = "meet me at".upper()
key = 3
key %= 26

alphabet = string.ascii_uppercase
shiftedAlphabet = alphabet[key:] + alphabet[:key]

print(text.translate(str.maketrans(alphabet, shiftedAlphabet)))