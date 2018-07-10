#пример простого фильтра

import sys

def revline(line):
    print(line[::-1], end=" ")

def process_file(f):
    for line in f:
        revline(line)


if (len(sys.argv)) == 1 :
    process_file(sys.stdin)
else:
    for path in sys.argv[1:] :
        try:
            file = open(path, "r")
        except Exception as e:
            print("%s" % e, file = sys.stderr)
            continue
        process_file(file)
        file.close()
