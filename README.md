# Parking Lot System Design

![RoughIdea](/images/RoughIdea.png)

## Requirement Specification
- How many Entances are there in the parking lot
- - min 1 entance (but code must be scalable)
- - min 1 exit
- Different types of spots?
- - 2 wheeler
- - 4 wheeler
- - 3 wheeler
- - must be extendable to support more types
- Payment Strategy
- - Hourly
- - minutely
- parking strategy
- No of floors

(assume for this case both)

## Objects
- Vehicle
- - Vehicle no
- - Vehicle type -> enum
- Ticket
- - Entry time
- - parking spot
- Entrance Gate
- - find Parking space (function)
- - update parking space(function)
- - Generate ticket (function)
- Parking Spot 
- - Spot no
- - Spot type
- - Spot status
- - Vehicle
- Exit Gate
- - cost calculation(function)
- - update parking space
- - payment