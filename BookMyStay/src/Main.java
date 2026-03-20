public class Main {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();
        inventory.addRoom("Standard Room", 1);

        BookingHistory history = new BookingHistory();

        Reservation r1 = new Reservation("Alice", "Standard Room");
        r1.setRoomId("STA1");

        history.addReservation(r1);

        // simulate booking (inventory reduced)
        inventory.decrementRoom("Standard Room");

        CancellationService cancelService = new CancellationService();

        // cancel booking
        cancelService.cancelReservation("STA1", history, inventory);

        // try invalid cancellation
        cancelService.cancelReservation("STA2", history, inventory);

        // show history
        for (Reservation r : history.getAllReservations()) {
            r.display();
        }
    }
}
