import com.low.level.design.examples.parkinglot.FourWheelerWeekDayChargeStrategy;
import com.low.level.design.examples.parkinglot.InvalidVehicleNumberException;
import com.low.level.design.examples.parkinglot.ParkingFullException;
import com.low.level.design.examples.parkinglot.ParkingLot;
import com.low.level.design.examples.parkinglot.Ticket;
import com.low.level.design.examples.parkinglot.TwoWheelerWeekDayChargeStrategy;
import com.low.level.design.examples.parkinglot.Vehicle;
import com.low.level.design.examples.parkinglot.VehicleSize;

public class Main {
    public static void parkingLotTest() throws ParkingFullException, InvalidVehicleNumberException {
        ParkingLot parkingLot = ParkingLot.getParkingLot();

        parkingLot.initializeParkingSlots(10, 10);

        Vehicle vehicle = new Vehicle("Mh12", VehicleSize.TWOWHEELER);

        Ticket ticket = parkingLot.park(vehicle);
        System.out.println(ticket);

        Vehicle vehicle2 = new Vehicle("Mh13", VehicleSize.FOURWHEELER);

        Ticket ticket2 = parkingLot.park(vehicle2);
        System.out.println(ticket2);

        int cost1 = parkingLot.unPark(ticket, new TwoWheelerWeekDayChargeStrategy());
        System.out.println(cost1);

        int cost2 = parkingLot.unPark(ticket2, new FourWheelerWeekDayChargeStrategy());
        System.out.println(cost2);
    }
    public static void main(String[] args) {
        System.out.println("1. Test Parking-Lot Design");
        try {
            parkingLotTest();
        } catch (ParkingFullException e) {
            throw new RuntimeException(e);
        } catch (InvalidVehicleNumberException e) {
            throw new RuntimeException(e);
        }
        System.out.println("== END :: Test Parking-Lot Design ==\n");
    }
}