#!/usr/bin/python3
#показывает простые числа (пример управления сигналами)
#добавление обработчика сигналов

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


#обработчик
debug = False
def sighup_handler(signum, frame):
    global debug
    debug = not debug

signal(SIGHUP, sighup_handler) #установили обработчик

n = 1
prime_list =[]

signal(SIGINT, SIG_IGN)  #игнорирование сигнала sigint
signal(SIGTERM, SIG_IGN)
signal(SIGQUIT, SIG_IGN)
while True:
    if isprime(n):
        if debug:
            print("%d is prime" % n )
        prime_list.append(n)
    n += 1
