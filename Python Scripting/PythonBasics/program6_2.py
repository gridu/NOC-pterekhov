#!/usr/bin/python3
#показывает простые числа (пример управления сигналами)

import time
from signal import *

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
signal(SIGINT, SIG_IGN)  #игнорирование сигнала sigint
while True:
    if isprime(n):
        print("%d is prime" % n + " use CTRL + \ to stop")
        prime_list.append(n)
    n += 1

# ctrl+\ что бы остановить выполнение программы