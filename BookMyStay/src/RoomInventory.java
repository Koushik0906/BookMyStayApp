import java.util.HashMap;

class RoomInventory {

    private HashMap<String, Integer> inventory;

    // constructor
    public RoomInventory() {
        inventory = new HashMap<>();
    }

    // add room type
    public void addRoom(String roomType, int count) {
        inventory.put(roomType, count);
    }

    // get availability
    public int getAvailability(String roomType) {
        return inventory.getOrDefault(roomType, 0);
    }

    // update availability
    public void updateAvailability(String roomType, int newCount) {
        inventory.put(roomType, newCount);
    }

    public void decrementRoom(String roomType) {
        int count = inventory.getOrDefault(roomType, 0);
        if (count > 0) {
            inventory.put(roomType, count - 1);
        }
    }

    // display all rooms
    public void displayInventory() {
        System.out.println("\nCurrent Room Inventory:");
        for (String roomType : inventory.keySet()) {
            System.out.println(roomType + " → Available: " + inventory.get(roomType));
        }
    }

    public void incrementRoom(String roomType) {
        int count = inventory.getOrDefault(roomType, 0);
        inventory.put(roomType, count + 1);
    }

}
