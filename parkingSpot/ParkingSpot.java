package parkingSpot;

import vehicle.Vehicle;

public class ParkingSpot {

   public int id;
   public boolean isEmpty;
   public Vehicle vehicle;// has-a
   public int price;

   public void parkVehicle(Vehicle vehicle) {
      this.vehicle = vehicle;
      isEmpty = false;
   }

   public void removeVehicle() {
      this.vehicle = null;
      isEmpty = true;
   }
}