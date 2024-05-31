package parkingSpot;

import java.util.List;
import vehicle.Vehicle;
import vehicle.VehicleType;

public class ParkingSpotManagerFactory {

   TwoWheelerSpotManager twoWheelerSpotManager;
   FourWheelerSpotManager fourWheelerSpotManager;

   public ParkingSpotManagerFactory(List<ParkingSpot> parkingSpots) {
      twoWheelerSpotManager = new TwoWheelerSpotManager(parkingSpots);
      fourWheelerSpotManager = new FourWheelerSpotManager(parkingSpots);
   }

   // has-a relationship of parkingSpotManager
   public ParkingSpotManager getParkingSpotManager(Vehicle vehicle) {
      if (vehicle.vehicleType == VehicleType.TwoWheeler)
         return twoWheelerSpotManager;
      else
         return fourWheelerSpotManager;
   }

}
