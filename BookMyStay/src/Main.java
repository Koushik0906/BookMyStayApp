public class Main {

    public static void main(String[] args) {

        System.out.println("Hotel Booking - Request Queue System");

        BookingRequestQueue requestQueue = new BookingRequestQueue();

        // guest submits requests
        requestQueue.addRequest(new Reservation("Alice", "Standard Room"));
        requestQueue.addRequest(new Reservation("Bob", "Deluxe Room"));
        requestQueue.addRequest(new Reservation("Charlie", "Suite Room"));

        // display queue
        requestQueue.displayRequests();
    }
}
