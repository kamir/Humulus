#!/bin/sh
#
# DE: Sammle N-Triples auf und indiziere diese in einem "flachen Index"
# 
# http://stackoverflow.com/questions/12667797/using-curl-to-upload-post-data-with-files
# http://rdf-translator.appspot.com/

export FLUME_SPOOL_DIR=/flume/triple_files_spooldir

clear
echo Convert RDF/XML file $1/$2 now ...

#sudo mkdir /flume
#sudo mkdir /flume/triple_files_spooldir

curl -F "userid=1" -F "filecomment=This is an RDF XML file" -F "content=@$1/$2" http://rdf-translator.appspot.com/convert/xml/nt/content > $FLUME_SPOOL_DIR/$2.nt

ls -l $FLUME_SPOOL_DIR

