#поиск одинаковых файлов и указание ссылки на один экземпляр файла

import hashlib
import os

def gethash(file):
    hasher = hashlib.md5()
    try:
        with open (file, "rb") as f:
            buf = f.read()
            hasher.update(buf)
    except OSError:
        print(path + " is not found")
    return hasher.hexdigest()

hashmap = {}

for rootdir, dirs, files in os.walk("/home"):
    for f in files:
        try:
            path = os.path.join(rootdir, f)
            hash = gethash(path)

            if hash in hashmap:
                matching = hashmap[hash]
                if os.stat(path).st_ino == os.stat(matching).st_ino:
                    print(path + " " + matching + " are links to same file")
                    continue
                else:

                    os.unlink(path)
                    os.link(matching, path)
                    print(path + " is same as " + matching)
            else:
                hashmap[hash] = path

        except FileNotFoundError:
            print(path + " is not found")
            continue