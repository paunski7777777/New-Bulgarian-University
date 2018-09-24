class Fibs(object):
    def __init__(self):
        self.f0 = 1
        self.f1 = 0
        self.fNext = 0

    def __next__(self):
        self.fNext = self.f0 + self.f1
        self.f0 = self.f1
        self.f1 = self.fNext
        return self.fNext

    def __iter__(self):
        return self

fibs = Fibs()
for f in fibs:
    if f > 1000:
     print(f)
     break