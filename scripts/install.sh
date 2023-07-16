#!/bin/bash
cd /home/ubuntu/apps
sudo chmod 777 -R .
mvn package
sudo chmod 777 target/febe.jar