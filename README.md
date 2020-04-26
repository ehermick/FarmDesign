# FarmDesign
Utilizing design patterns to construct working farms


## Design Patterns Used :

### State Pattern: state Package
 -  Current part of the cycle (daytime or nighttime)
 - Requirements met:
	- Simulation runs on cycle (1 cycle = 1 day + 1 night)
	- Currency earned for each new day
	- Predators only come out at night

### Observer Pattern : 
 - Main class observes any changes that were made during the day or night and
   is notified of the changes
 - Money made, animals aquired/lost, farm upgrades, etc.
 - Requirements met:
	- Income is generated from selling crops/animal products
	- Animals are born every 4 cycles
	- Animals live for 14 days (28 cycles) unless killed by predator/disease
        - Crops are harvested every 

### Decorator Pattern : affinities Package
 - Affinities animals and crops have
 - Animals and crops can produce more, or have better health (Useful if attacked by predator)
 - With every birth of an animal, and every purchase of an animal or crop there is a chance
   that it will be super. 
 - Requirements met :
	- Animals have affinities
	- Crops have affinities
	- Farms make money based off the affinities
	- Predator's damage is based off the affinities
