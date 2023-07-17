#!/bin/bash
if screen -list | grep -q "escalenzo-link"; then
    screen -S escalenzo-link -X quit
fi