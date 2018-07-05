#!/bin/bash

echo "SCRIPT STARTS";

cd ~/ | ifconfig eth0 | awk '/inet addr:/ {print $1" "$2;}' 

echo "SCRIPT ENDS";
exit 0;
