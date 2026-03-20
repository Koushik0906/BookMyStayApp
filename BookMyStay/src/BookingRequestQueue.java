import java.util.LinkedList;
import java.util.Queue;

class BookingRequestQueue {

    private Queue<Reservation> queue;

    public BookingRequestQueue() {
        queue = new LinkedList<>();
    }

    // add request
    public void addRequest(Reservation reservation) {
        queue.add(reservation);
        System.out.println("Request added for " + reservation.guestName);
    }

    // view all requests
    public void displayRequests() {
        System.out.println("\nBooking Requests (FIFO Order):");

        for (Reservation r : queue) {
            r.display();
        }
    }
}
