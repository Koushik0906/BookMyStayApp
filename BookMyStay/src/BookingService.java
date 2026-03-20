import java.util.HashSet;
import java.util.Queue;

class BookingService {

    private HashSet<String> allocatedRoomIds = new HashSet<>();
    private int roomCounter = 1;

    public void processBookings(Queue<Reservation> queue, RoomInventory inventory) {

        System.out.println("\nProcessing Booking Requests...\n");

        while (!queue.isEmpty()) {

            Reservation request = queue.poll(); // dequeue

            String roomType = request.roomType;
            int available = inventory.getAvailability(roomType);

            if (available > 0) {

                // generate unique room ID
                String roomId = roomType.substring(0, 3).toUpperCase() + roomCounter++;

                // store allocated room ID
                allocatedRoomIds.add(roomId);

                // update inventory
                inventory.decrementRoom(roomType);

                // confirm booking
                System.out.println("Booking Confirmed!");
                System.out.println("Guest: " + request.guestName);
                System.out.println("Room Type: " + roomType);
                System.out.println("Room ID: " + roomId + "\n");

            } else {
                System.out.println("Booking Failed for " + request.guestName + " (No rooms available)\n");
            }
        }
    }
}
