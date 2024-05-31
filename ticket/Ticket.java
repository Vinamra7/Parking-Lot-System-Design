package ticket;

import parkingSpot.ParkingSpot;
import vehicle.Vehicle;

public class Ticket {
   public long entryTime;
   public ParkingSpot parkingSpot;// has-a
   public Vehicle vehicle;// has-a

   public Ticket(Vehicle vehicle, ParkingSpot parkingSpot) {
      this.vehicle = vehicle;
      this.parkingSpot = parkingSpot;
      this.entryTime = System.currentTimeMillis();
   }
}
