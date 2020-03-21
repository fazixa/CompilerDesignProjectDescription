from moratab import render

f = open("Phase 1\README.md", "r",encoding='utf-8')
g=render(f.read())
print (f.read())
print(g)
