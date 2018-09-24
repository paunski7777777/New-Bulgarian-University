class SchoolMember:
    def __init__(self, name, age):
        self.name = name
        self.age = age

class Teacher(SchoolMember):
    def __init__(self, name, age, salary, courses):
        super().__init__(name, age)
        self.salary = salary
        if courses:
            self.courses = courses
        else:
            self.courses={}

    def getSalary(self):
        return self.salary

    def addCourse(self, id, name):
        self.courses[id] = name

    def getCourses(self):
        for k, v in self.courses.items():
            print(k, v)

class Student(SchoolMember):
    def __init__(self, name, age, courses, grades):
        super().__init__(name, age)
        if courses:
            self.courses = courses
        else:
            self.courses={}
        if grades:
            self.grades = grades
        else:
            self.grades=[]

    def addGrade(self, id, grade):
        if self.courses.get(id):
            self.grades.append(grade)

    def attentCourse(self, id, year):
        self.courses[id] = {}
        self.courses[id][year] = self.grades

    def getAverageGrade(self, id):
        allGrades = [item for sublist in self.courses[id].values() for item in sublist]
        average = sum(allGrades) / len(allGrades)
        return average