# The White Walker

This is my algorithm on how to implement the white walker problem.

## About the algorithm

### The `Points` class :

Each place will be classified as a `Points`. Every `Points` will have a `name`, `number` and a `possibleDestinations`.

The `name` is the name of the place. The `number` is the id of the road that go towards that place. The `possibleDestinations` is the list of all possible destination from that place.

`NB : ` the `number` should be unique in the `possibleDestinations`, but can be duplicated anywhere else.

### The `RandomWalks` class :

This class handle the pattern for the white walker.

Indeed, this class handle the destination place `destinationPoint` ( the target place of the white walker ) and the current place `currentPoit` ( the actual place of the white walker).

#### The `getRandomPoint` method :

This static method choose the next destination of the white walker.

#### The `randomWalk` method :

This method draws the pattern of the while walker from the current place towards the destination place.


### Example : 
        
            // Create places
        Points HEI = new Points("HEI", 0);
        Points PULLMAN = new Points("PULLMAN", 1);
        Points BALANCOIR = new Points("Balançoire", 2);
        Points NEXTA = new Points("NEXTA", 3);
        Points ESTI =  new Points("ESTI", 4);
        Points BOULEVARD = new Points("BOULEVARD", 5);
        Points SEKOLINTSIKA = new Points("SEKOLINTSIKA", 6);
        Points MARAIS = new Points("MARAIS", 7);
    
            // Create all possible destination for each places
        List<Points> pointsList1 = List.of(BALANCOIR, PULLMAN, SEKOLINTSIKA);
        HEI.setPossibleDestinations(pointsList1);

        List<Points> pointsList2 = List.of(HEI, NEXTA, BALANCOIR);
        PULLMAN.setPossibleDestinations(pointsList2);

        List<Points> pointsList3 = List.of(HEI, PULLMAN, BOULEVARD, ESTI);
        BALANCOIR.setPossibleDestinations(pointsList3);

        List<Points> pointsList4 = List.of(PULLMAN);
        NEXTA.setPossibleDestinations(pointsList4);

        List<Points> pointsList5 = List.of(BOULEVARD, BALANCOIR);
        ESTI.setPossibleDestinations(pointsList5);

        List<Points> pointsList6 = List.of(BALANCOIR, ESTI);
        BOULEVARD.setPossibleDestinations(pointsList6);

        List<Points> pointsList7 = List.of(HEI, MARAIS);
        SEKOLINTSIKA.setPossibleDestinations(pointsList7);

        List<Points> pointsList8 = List.of(SEKOLINTSIKA);
        MARAIS.setPossibleDestinations(pointsList8);
            
            // create the planning of the trip
        var randomWalks = new RandomWalks(HEI, NEXTA);

            // execute the random walk of the white walker
        randomWalks.randomWalk();

The result :

        [Points{name='HEI}, Points{name='PULLMAN}, Points{name='NEXTA}]
    