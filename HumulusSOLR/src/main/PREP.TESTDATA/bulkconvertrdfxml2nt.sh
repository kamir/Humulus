#!/bin/sh
#
# DE: Sammle N-Triples auf und indiziere diese in einem "flachen Index"
# 
# http://stackoverflow.com/questions/12667797/using-curl-to-upload-post-data-with-files
# http://rdf-translator.appspot.com/

export FLUME_SPOOL_DIR=/flume/triple_files_spooldir

clear
echo "### Convert all RDF/XML files in folder ($1) now into N-triple (one triple per line) ..."

read

#sudo mkdir /flume
#sudo mkdir /flume/triple_files_spooldir

sudo mkdir $FLUME_SPOOL_DIR/$1

for d in ./$1/*.rdf ; do
    echo "$d"
    curl -F "userid=1" -F "filecomment=This is an RDF XML file" -F "content=@$d" http://rdf-translator.appspot.com/convert/xml/nt/content > $FLUME_SPOOL_DIR/$d.nt
done
echo "### This is the content of the FLUME_SPOOL_DIR ($FLUME_SPOOL_DIR):"
ls -l $FLUME_SPOOL_DIR/$1
echo "### Above is the content of the FLUME_SPOOL_DIR ($FLUME_SPOOL_DIR) ###"

