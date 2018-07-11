#!/usr/bin/python3

#отправка письма 

import subprocess
import smtplib
from subprocess import *
from email.mime.text import *
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
print("mailbox is %s" % options.mailbox)



def report_a_message(message, sender, password, recipient):
    msg = MIMEText(message)
    msg["Subject"] = "Test report"
    msg["From"] = "Pavel Terekhov"
    msg["To"] = recipient

    t = smtplib.SMTP('smtp.gmail.com', 587)
    t.ehlo()
    t.starttls()
    t.login(sender, password)

    try:
        t.sendmail(sender, recipient, msg.as_string())
        print("Message is sent")
    except:
        print("Error sending email")

    t.quit()


print("Message: ")
message = input()

print("Your email:")
sender = input()

print("Your password:")
password = input()
if options.mailbox:
    try:
        report_a_message(message, sender, password, options.mailbox)
    except Exception as e:
        print(e)

print("Stop")