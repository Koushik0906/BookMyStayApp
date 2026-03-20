import java.util.HashSet;
import java.util.Queue;

class BookingService {

    private HashSet<String> allocatedRoomIds = new HashSet<>();
    private int roomCounter = 1;

    public void processBookings(Queue<Reservation> queue,
                                RoomInventory inventory,
                                BookingHistory history) {

        while (!queue.isEmpty()) {

            Reservation request = queue.poll();

            String roomType = request.roomType;
            int available = inventory.getAvailability(roomType);

            if (available > 0) {

                String roomId = roomType.substring(0, 3).toUpperCase() + roomCounter++;

                allocatedRoomIds.add(roomId);

                inventory.decrementRoom(roomType);

                request.setRoomId(roomId);

                // ✅ store in history
                history.addReservation(request);

                System.out.println("Booking Confirmed for " + request.guestName);

            } else {
                System.out.println("Booking Failed for " + request.guestName);
            }
        }
    }

}
