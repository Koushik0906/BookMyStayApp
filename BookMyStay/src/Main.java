import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hotel Booking Application - Room Search");

        // inventory
        RoomInventory inventory = new RoomInventory();
        inventory.addRoom("Standard Room", 10);
        inventory.addRoom("Deluxe Room", 0);   // unavailable
        inventory.addRoom("Suite Room", 2);

        // room details
        HashMap<String, Room> roomDetails = new HashMap<>();
        roomDetails.put("Standard Room", new Room("Standard Room", 2000));
        roomDetails.put("Deluxe Room", new Room("Deluxe Room", 4000));
        roomDetails.put("Suite Room", new Room("Suite Room", 7000));

        // search service
        SearchService searchService = new SearchService();

        // perform search
        searchService.searchAvailableRooms(inventory, roomDetails);
    }
}
