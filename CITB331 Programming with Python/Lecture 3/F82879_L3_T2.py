text = "ATTACKATDAWN"
key = "LEMON"

keyLength = len(key)
keyAsInt = [ord(i) for i in key]
text = [ord(i) for i in text]
result = ''

for i in range(len(text)):
    value = (text[i] + keyAsInt[i % keyLength]) % 26
    result += chr(value + 65)

print(result)