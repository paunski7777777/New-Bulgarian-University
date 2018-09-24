import sys

def isPalindrome(word):
    if len(word) < 2:
        return True

    if word[0] != word[-1]:
        return False

    return isPalindrome(word[1:-1])

print(isPalindrome(sys.argv[1]))