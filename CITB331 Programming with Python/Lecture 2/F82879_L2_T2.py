from pip._vendor.distlib.compat import raw_input

'''
str1 = raw_input()
str2 = raw_input()
'''

str1 = "Vladimir Nabokov"
str2 = "Vivian Darkbloom"

str3 = "rocket boys"
str4 = "october sky"

print(sorted(str1) == sorted(str2))
print(sorted(str3) == sorted(str4))

