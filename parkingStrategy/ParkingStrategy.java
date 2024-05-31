package parkingStrategy;

import parkingSpot.ParkingSpot;
import java.util.List;

public interface ParkingStrategy {
   public ParkingSpot parkingSpot(List<ParkingSpot> parkingSpots);
}
