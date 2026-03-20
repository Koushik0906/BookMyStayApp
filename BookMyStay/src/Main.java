public class Main {

    public static void main(String[] args) {

        System.out.println("Hotel Booking Application - Inventory System");

        // initialize inventory
        RoomInventory inventory = new RoomInventory();

        // register room types
        inventory.addRoom("Standard Room", 10);
        inventory.addRoom("Deluxe Room", 5);
        inventory.addRoom("Suite Room", 2);

        // display inventory
        inventory.displayInventory();

        // update availability (example booking)
        inventory.updateAvailability("Standard Room", 8);

        System.out.println("\nAfter Booking Update:");
        inventory.displayInventory();
    }
}
