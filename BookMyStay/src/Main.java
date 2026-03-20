import java.util.*;

public class Main {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();
        inventory.addRoom("Standard Room", 2);
        inventory.addRoom("Deluxe Room", 1);

        Queue<Reservation> queue = new LinkedList<>();
        queue.add(new Reservation("Alice", "Standard Room"));
        queue.add(new Reservation("Bob", "Standard Room"));
        queue.add(new Reservation("Charlie", "Deluxe Room"));

        BookingHistory history = new BookingHistory();

        BookingService service = new BookingService();
        service.processBookings(queue, inventory, history);

        BookingReportService reportService = new BookingReportService();

        reportService.showAllBookings(history);
        reportService.generateSummary(history);
    }
}
