## Color App

ColorApp is a simple Java application that show Color in 2 version:
- Blue
- Green

See releases for the Jar file.
 
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

### What endpoints are available? ###

#### Demo Self healing
```/errors/throw```
and 
```/errors/kill```

#### Demo AutoScaling using Latency as a metric
```/latency/{seconds}```

For example, I want to have the current request taking 2 seconds:
```/latency/2```

## Remote Debug




