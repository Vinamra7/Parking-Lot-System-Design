package parkingSpot;

import java.util.List;
import parkingStrategy.ParkingStrategy;

abstract public class ParkingSpotManager {
   List<ParkingSpot> parkingSpots; // has-a

   ParkingSpotManager(List<ParkingSpot> ps) {
      this.parkingSpots = ps;
   }

   public abstract ParkingSpot findParkingSpot(ParkingStrategy parkingStrategy);

   public void removeVehicle(ParkingSpot parkingSpot) {
      // remove parking spot from list
      parkingSpot.removeVehicle();
   }
}
