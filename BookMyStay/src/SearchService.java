import java.util.HashMap;

class SearchService {

    public void searchAvailableRooms(RoomInventory inventory, HashMap<String, Room> roomDetails) {

        System.out.println("\nAvailable Rooms:");

        for (String type : roomDetails.keySet()) {

            int available = inventory.getAvailability(type);

            // filter unavailable rooms
            if (available > 0) {
                Room room = roomDetails.get(type);
                System.out.println(type + " | Price: ₹" + room.price + " | Available: " + available);
            }
        }
    }
}
