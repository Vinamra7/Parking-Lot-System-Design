import java.util.List;

import enteranceGate.EnteranceGate;
import exitGate.ExitGate;
import parkingSpot.ParkingSpot;
import parkingSpot.ParkingSpotManager;
import parkingSpot.ParkingSpotManagerFactory;
import parkingStrategy.NearEntryParkingStat;
import parkingStrategy.ParkingStrategy;
import ticket.Ticket;
import vehicle.Vehicle;
import vehicle.VehicleType;

public class ParkingLot {

   public static List<ParkingSpot> parkingSpots;

   public static void main(String[] args) {
      // new vehicle comes
      Vehicle vehicle = new Vehicle(4576, VehicleType.FourWheeler);

      // call parking spot manager factory
      ParkingSpotManagerFactory factory = new ParkingSpotManagerFactory(parkingSpots);
      ParkingSpotManager manager = factory.getParkingSpotManager(vehicle);

      // Vehicle comes at enterance gate
      EnteranceGate enteranceGate = new EnteranceGate(manager);

      // ask where to park
      ParkingStrategy parkingStrategy = new NearEntryParkingStat();

      // Driver choose near entry spot
      ParkingSpot parkingSpot = enteranceGate.getParkingSpot(vehicle, parkingStrategy);
      parkingSpot.parkVehicle(vehicle);
      Ticket ticket = enteranceGate.gnereateTicket(vehicle, parkingSpot);

      // vehicle Leaves
      ExitGate exitGate = new ExitGate(manager);
      exitGate.removeParkingSpot(ticket);
   }
}
