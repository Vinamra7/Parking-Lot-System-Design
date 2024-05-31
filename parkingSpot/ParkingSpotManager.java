package parkingSpot;

import java.util.List;
import vehicle.Vehicle;
import parkingStrategy.ParkingStrategy;

abstract public class ParkingSpotManager {
   List<ParkingSpot> parkingSpots; // has-a
   public ParkingStrategy parkingStrategy;

   ParkingSpotManager(List<ParkingSpot> ps, ParkingStrategy psStrategy) {
      this.parkingSpots = ps;
      this.parkingStrategy = psStrategy;
   }

   abstract ParkingSpot findParkingSpot();

   void addParkingSpot() {

   }

   void removeParkingSpot() {

   }

   void parkVehicle(Vehicle vehicle) {

   }

   void removeVehicle() {

   }
}
