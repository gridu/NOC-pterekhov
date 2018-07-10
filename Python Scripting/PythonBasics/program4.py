#пример манипуляции потоками

import sys

print("this is in STDOUT")
print("this is in STDERR", file = sys.stderr)

f = open("out1", "w")
print("this is in out1", file = f)
f.close()

with open("out2", "w") as f:
    print("this is in out2", file = f)

old_stdout = sys.stdout

with open("out3", "w") as f:
    sys.stdout = f
    print("this is in out3")

sys.stdout = old_stdout
print("stdout is restored")

