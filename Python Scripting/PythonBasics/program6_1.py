#!/usr/bin/python3
#показывает простые числа (пример управления сигналами)

import time
def isprime(n):
    time.sleep(0.1)
    x = 2
    while (x*x)<=n:
        if not n % x:
            return False
        x += 1
    return True

n = 1
prime_list =[]

while True:
    if isprime(n):
        print("%d is prime" % n)
        prime_list.append(n)
    n += 1

# ctrl+c для отправки сигнала sigint что бы остановить выполнение программы  


