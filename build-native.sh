#!/bin/bash
./mvnw -Pnative spring-boot:build-image -DCOLOR_APP_BUILD_VERSION=0.0.5-SNAPSHOT-blue -DCOLOR_APP_DISPLAY_BGCOLOR=blue -DCOLOR_APP_DISPLAY_VERSION=1-native

./mvnw -Pnative spring-boot:build-image -DCOLOR_APP_BUILD_VERSION=0.0.5-SNAPSHOT-green -DCOLOR_APP_DISPLAY_BGCOLOR=green -DCOLOR_APP_DISPLAY_VERSION=2-native
