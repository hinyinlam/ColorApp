#!/bin/bash

./mvnw clean package -DCOLOR_APP_BUILD_VERSION=0.0.5-SNAPSHOT-blue -DCOLOR_APP_DISPLAY_BGCOLOR=blue -DCOLOR_APP_DISPLAY_VERSION=1
mv target/colorapp-0.0.5-SNAPSHOT-blue.jar ./
./mvnw clean package -DCOLOR_APP_BUILD_VERSION=0.0.5-SNAPSHOT-green -DCOLOR_APP_DISPLAY_BGCOLOR=green -DCOLOR_APP_DISPLAY_VERSION=2
mv target/colorapp-0.0.5-SNAPSHOT-green.jar ./


