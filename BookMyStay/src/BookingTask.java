class BookingTask implements Runnable {

    private Reservation reservation;
    private RoomInventory inventory;

    public BookingTask(Reservation reservation, RoomInventory inventory) {
        this.reservation = reservation;
        this.inventory = inventory;
    }

    @Override
    public void run() {

        String roomType = reservation.roomType;

        synchronized (inventory) { // critical section

            if (inventory.allocateRoom(roomType)) {

                String roomId = roomType.substring(0, 3).toUpperCase()
                        + Thread.currentThread().getId();

                System.out.println("Booking SUCCESS for " +
                        reservation.guestName +
                        " | Room ID: " + roomId);

            } else {
                System.out.println("Booking FAILED for " +
                        reservation.guestName +
                        " (No rooms available)");
            }
        }
    }
}
