import sqlite3
import sys

conn = sqlite3.connect('f82879-food.sqlite')
curs = conn.cursor()

curs.execute("CREATE TABLE food(code, descript, nmbr, nutname, retention)")

file = open('food.txt', 'r')
lines = file.readlines()

foodInfo = []

for l in lines:
    foodInfo.append(l.split('^'))

for f in foodInfo:
    curs.execute("INSERT INTO food(code, descript, nmbr, nutname, retention) VALUES (?, ?, ?, ?, ?)",
                 (f[0].replace('~', ''), f[1].replace('~', ''), f[2].replace('~', ''), f[3].replace('~', ''), f[4].replace('~', '')))

query = sys.argv[1]
#query2 = "select * from food where descript like '%VEAL%'"

curs.execute(query)
data = curs.fetchall()
for row in data:
    print(row)

conn.commit()
conn.close()