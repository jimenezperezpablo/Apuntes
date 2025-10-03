#!/bin/bash
cd proyecto
find -type f -name "*.txt"
find -type d -name "*backup*"
find proyecto -type f -mtime -1