#!/usr/bin/python3
#парсер для командной строки

from optparse import OptionParser

parser = OptionParser()
parser.add_option("-t","--threshold",       #добавление нового параметра целочисленного типа
                  dest ="threshold",
                  type ="int",
                  default =100,
                  help ="Set threshold(%)")

parser.add_option("-s", "--single",         #добавление нового параметра логического типа
                  action ="store_true",
                  dest ="singleshot",
                  default=False,
                  help ="just check once, not loop")

parser.add_option("-m", "--mailbox",        #добавление нового параметра строкового типа
                  dest ="mailbox",
                  help ="mail report to this mailbox")

(options, args) = parser.parse_args()
print("singleshot is %r" % options.singleshot)
print("mailbox is %s" % options.mailbox)
print("threshold is %d" % options.threshold)
print("non-option argument list is %s" % str(args))