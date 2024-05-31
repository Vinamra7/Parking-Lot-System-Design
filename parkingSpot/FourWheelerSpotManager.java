package parkingSpot;

import java.util.List;

import parkingStrategy.ParkingStrategy;

public class FourWheelerSpotManager extends ParkingSpotManager {
   // is a relation with ParkingSpotManager
   // we can pass any park strategy like nearEntry or nearExit
   FourWheelerSpotManager(List<ParkingSpot> parkingSpots) {
      super(parkingSpots);
   }

   @Override
   public ParkingSpot findParkingSpot(ParkingStrategy parkingStrategy) {
      // Implement nearest find algorithm
      return parkingSpots.get(0);
   }
}
