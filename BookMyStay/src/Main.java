import java.util.*;

public class Main {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();
        inventory.addRoom("Standard Room", 1);

        Queue<Reservation> queue = new LinkedList<>();

        queue.add(new Reservation("Alice", "Standard Room"));  // valid
        queue.add(new Reservation("", "Standard Room"));       // invalid name
        queue.add(new Reservation("Bob", "Deluxe Room"));      // invalid type
        queue.add(new Reservation("Charlie", "Standard Room")); // no availability

        BookingHistory history = new BookingHistory();

        BookingService service = new BookingService();
        service.processBookings(queue, inventory, history);
    }
}
