class BookingService {

    private HashSet<String> allocatedRoomIds = new HashSet<>();
    private int roomCounter = 1;

    private BookingValidator validator = new BookingValidator();

    public void processBookings(Queue<Reservation> queue,
                                RoomInventory inventory,
                                BookingHistory history) {

        while (!queue.isEmpty()) {

            Reservation request = queue.poll();

            try {
                // ✅ validate first
                validator.validate(request, inventory);

                String roomType = request.roomType;

                String roomId = roomType.substring(0, 3).toUpperCase() + roomCounter++;

                allocatedRoomIds.add(roomId);

                inventory.decrementRoom(roomType);

                request.setRoomId(roomId);

                history.addReservation(request);

                System.out.println("Booking Confirmed for " + request.guestName);

            } catch (InvalidBookingException e) {

                // ✅ graceful failure
                System.out.println("Booking Failed: " + e.getMessage());
            }
        }
    }
}
