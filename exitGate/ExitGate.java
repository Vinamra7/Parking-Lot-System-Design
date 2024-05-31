package exitGate;

import parkingSpot.ParkingSpotManager;
import ticket.Ticket;

public class ExitGate {
   public ParkingSpotManager parkingSpotManager;

   public ExitGate(ParkingSpotManager parkingSpotManager) {
      this.parkingSpotManager = parkingSpotManager;
   }

   public void removeParkingSpot(Ticket ticket) {
      // remove ticket.parkingSpot from the list
      parkingSpotManager.removeVehicle(ticket.parkingSpot);
   }

}
