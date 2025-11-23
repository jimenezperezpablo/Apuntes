 #!/bin/bash
for palabra in $@ ; do 
if [ $palabra != $1 ]; then 
echo $palabra >> $1 
fi
done