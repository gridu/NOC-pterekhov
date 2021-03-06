# поиск файлов у которых нет владельца

import os
import pwd

print("Start")

testdir = "/home"
uidset = set()

for user in pwd.getpwall():
    uidset.add(user.pw_uid)


for folder, dirs, files in os.walk(testdir):
    for file in files:
        path = folder + "/" + file
        try:
            attributes = os.stat(path)
        except FileNotFoundError:
            print(path + " is not found")
            continue
        if attributes.st_uid not in uidset:
            print(path + " has no owner")


print("End")
