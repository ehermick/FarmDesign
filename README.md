# FarmDesign
Utilizing design patterns to construct working farms


## Design Patterns Used :
### State Pattern: 
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
	- Animals live for 14 days unless killed by predator/disease

### Decorator Pattern : 
 - Affinities animals and farmers have
 - Farmers can be better with crops, animals, or money. Animals can be better at producing 
   products, or have better health
 - Requirements met :
	- Animals have affinities
	- Farmers have affinities
	- Farms make money based off the affinities
	- Predator's damage is based off the affinities
