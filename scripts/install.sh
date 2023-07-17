#!/bin/bash
cd /home/ubuntu/apps
rm -f target/febe.jar
sudo chmod 777 -R .
mvn package
if [[ "$?" -ne 0 ]] ; then
  echo 'Error en mvn package'; exit 1
fi
sudo chmod 777 target/febe.jar