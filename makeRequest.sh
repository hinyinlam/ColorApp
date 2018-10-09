#!/bin/bash

COLORAPPURL=https://colorapptest.cfapps.io
#Comment out for your need


#while true; do
#  curl  $COLORAPPURL/latency/5
#done;

CONCURRENT_REQUEST_PER_SECOND=30
while true; do
  for i in `seq 1 $CONCURRENT_REQUEST_PER_SECOND`; do
     echo Request $i;
     curl $COLORAPPURL > /dev/null 2>&1 &
  done;
  sleep 1;
done;

