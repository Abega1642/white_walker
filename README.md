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

            // create all places
        Points HEI = new Points("HEI", 0);
        Points PULLMAN = new Points("PULLMAN", 1);
        Points BALANCOIR = new Points("Balançoire", 2);
        Points NEXTA = new Points("NEXTA", 3);
        Points ESTI =  new Points("ESTI", 4);
        Points BOULEVARD = new Points("BOULEVARD", 5);
        Points SEKOLINTSIKA = new Points("SEKOLINTSIKA", 6);
        Points MARAIS = new Points("MARAIS", 7);

            // create all possible roads
        HEI.setPossibleDestinations(List.of(BALANCOIR, PULLMAN, SEKOLINTSIKA));
        PULLMAN.setPossibleDestinations(List.of(HEI, NEXTA, BALANCOIR));
        BALANCOIR.setPossibleDestinations(List.of(HEI, PULLMAN, BOULEVARD, ESTI));
        NEXTA.setPossibleDestinations(List.of(PULLMAN));
        ESTI.setPossibleDestinations(List.of(BOULEVARD, BALANCOIR));
        BOULEVARD.setPossibleDestinations(List.of(BALANCOIR, ESTI));
        SEKOLINTSIKA.setPossibleDestinations(List.of(HEI, MARAIS));
        MARAIS.setPossibleDestinations(List.of(SEKOLINTSIKA));
            
            // create the planning of the trip
        var randomWalks = new RandomWalks(HEI, NEXTA);

            // execute the random walk of the white walker
        randomWalks.randomWalk();

The result :

        [Points{name='HEI}, Points{name='PULLMAN}, Points{name='NEXTA}]
    