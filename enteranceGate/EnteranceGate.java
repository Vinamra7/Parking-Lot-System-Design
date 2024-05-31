package enteranceGate;

import parkingSpot.ParkingSpot;
import parkingSpot.ParkingSpotManager;
import parkingStrategy.ParkingStrategy;
import ticket.Ticket;
import vehicle.Vehicle;

public class EnteranceGate {

   public ParkingSpotManager manager;

   public EnteranceGate(ParkingSpotManager parkingSpotManager) {
      manager = parkingSpotManager;
   }

   public ParkingSpot getParkingSpot(Vehicle vehicle, ParkingStrategy parkingStrategy) {
      ParkingSpot parkingSpot = manager.findParkingSpot(parkingStrategy);
      return parkingSpot;
   }

   public Ticket gnereateTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
      return new Ticket(vehicle, parkingSpot);
   }
}
