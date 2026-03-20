import java.util.*;

class BookingHistory {

    private List<Reservation> history = new ArrayList<>();

    // add confirmed booking
    public void addReservation(Reservation reservation) {
        history.add(reservation);
    }

    // get all bookings
    public List<Reservation> getAllReservations() {
        return history;
    }
}
