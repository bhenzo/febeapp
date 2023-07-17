#!/bin/bash
cd /home/ubuntu/apps/escalenzolink_bin
echo "init app at $(date)" >> log.txt
screen -dmS escalenzo-link java -jar febe.jar