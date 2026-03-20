import java.util.*;

class BookingReportService {

    // display all bookings
    public void showAllBookings(BookingHistory history) {

        System.out.println("\nBooking History:");

        for (Reservation r : history.getAllReservations()) {
            r.display();
        }
    }

    // summary report
    public void generateSummary(BookingHistory history) {

        int total = history.getAllReservations().size();

        System.out.println("\nTotal Bookings: " + total);

        // count per room type
        HashMap<String, Integer> countMap = new HashMap<>();

        for (Reservation r : history.getAllReservations()) {
            countMap.put(r.roomType,
                    countMap.getOrDefault(r.roomType, 0) + 1);
        }

        System.out.println("\nBookings by Room Type:");

        for (String type : countMap.keySet()) {
            System.out.println(type + " → " + countMap.get(type));
        }
    }
}
