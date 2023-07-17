#!/bin/bash
cd /home/ubuntu/apps/escalenzolink_src
sudo chmod 777 -R .
mvn package
if [[ "$?" -ne 0 ]] ; then
  echo 'Error en mvn package'; exit 1
fi
sudo chmod 777 target/febe.jar
cp target/febe.jar /home/ubuntu/apps/escalenzolink_bin