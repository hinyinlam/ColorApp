#!/bin/bash
./mvnw -Pnative native:compile -DCOLOR_APP_BUILD_VERSION=0.0.5-SNAPSHOT-blue -DCOLOR_APP_DISPLAY_BGCOLOR=blue -DCOLOR_APP_DISPLAY_VERSION=1_native
mv target/colorapp ./color-app-0.0.5-SNAPSHOT-blue

./mvnw -Pnative native:compile -DCOLOR_APP_BUILD_VERSION=0.0.5-SNAPSHOT-green -DCOLOR_APP_DISPLAY_BGCOLOR=green -DCOLOR_APP_DISPLAY_VERSION=2_native
mv target/colorapp ./color-app-0.0.5-SNAPSHOT-green

### Docker image with native binary (takes much longer to compile in Macbook M1)
#./mvnw -Pnative spring-boot:build-image -DCOLOR_APP_BUILD_VERSION=0.0.5-SNAPSHOT-blue -DCOLOR_APP_DISPLAY_BGCOLOR=blue -DCOLOR_APP_DISPLAY_VERSION=1_native
#./mvnw -Pnative spring-boot:build-image -DCOLOR_APP_BUILD_VERSION=0.0.5-SNAPSHOT-green -DCOLOR_APP_DISPLAY_BGCOLOR=green -DCOLOR_APP_DISPLAY_VERSION=2-native
