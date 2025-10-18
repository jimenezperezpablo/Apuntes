#!/bin/bash
numeroLineas=$(cat $1 | wc -l)
mitad=$(($numeroLineas/2))
(head -n $mitad $1; echo $2; tail -n $mitad $1) > temp.txt;
mv temp.txt $1
