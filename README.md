## Color App

ColorApp is a simple Java application that show Color in 2 version:
- Blue
- Green

See releases for the Jar file.


##README NOT DONE YET 
 
### How to demo Blue-Green deployment:

#### Deploy "Blue version"
```bash
cf push blueapp -p colorapp-0.0.3-SNAPSHOT-blue.jar --hostname colorapp
```

Visit the app's URL, it should look like this:


#### Deploy "Green version"
```bash
cf push blueapp -p colorapp-0.0.3-SNAPSHOT-green.jar --hostname colorapp
```

## Demo Self healing

## Demo AutoScaling using Latency as a metric

## Remote Debug




