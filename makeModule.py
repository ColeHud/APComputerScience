#!/usr/bin/env python
from subprocess import call

print("Enter module number: ")
number = input()
print()

call(["mkdir", "Module " + str(number)])
call(["mkdir", "Module " + str(number) + "/Documents"])
call(["mkdir", "Module " + str(number) + "/Assignments"])
call(["mkdir", "Module " + str(number) + "/Lessons"])


'''/Users/school_cole/Desktop/APCS\ Course\ Files/Module\ 17'''