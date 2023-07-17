#!/bin/bash
cd /home/ubuntu/apps/target
echo 'init app' >> log.txt
screen -dmS escalenzo-link java -jar febe.jar