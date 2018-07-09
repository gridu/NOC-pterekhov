#!/bin/bash

echo "SCRIPT STARTS";

find ~/ -size +10k -size -100k -exec du -h --block-size=K {} \;| sort -nk 1  > FileList.txt  ;

echo "SCRIPT ENDS";
exit 0;
