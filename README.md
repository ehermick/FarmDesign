# FarmDesign
Utilizing design patterns to construct working farms


## Design Patterns Used :

### State Pattern: state Package
 -  Current part of the cycle (daytime or nighttime)
 - Requirements met:
	- Simulation runs on cycle (1 cycle = 1 day + 1 night)
	- Currency earned for each new day
	- Predators only come out at night

### Factory Pattern : 
 - 3 types of farm can be built : Animal, Crop, and Hybrid
 - Animal farms have animals
 - Crop farms have crops
 - Hybrid farms have both animals and crops
 - Requirements met : 
        - Farms can be of different types

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

## Total Requirements Met :
 - A new world created with atleast 1 farm
 - Farms can be of different types
 - Simulation runs on cycles (day and night)
 - Currency is earned with each new day - not night (based on selling crop/animal products)
 - More currency earned based on animal/crop affinities
 - Animal product is replenished after every 2nd day 
 - Animals can be super healthy or super productive
 - Predators come out only at night 
	- Foxes and Wolves injure/eat animals
 	- Moles and Rabbits damage/eat crops
 - There's a chance an animal can be born every 4 cycles (if atleast 2 days old)
 - Animals only live for 14 days (unless killed by a predator or repeatedly injured)
 - Animals cannot produce anything for the first 3 days - but can still be killed/injured
 - A farmer can treat an injured animal or damaged crop
 - Crops can be harvested once every 3 cycles
 - If crop/animal level is reduced to 0, the system auto replenishes crop/animal
 - Animals and crops cost currency to purchase