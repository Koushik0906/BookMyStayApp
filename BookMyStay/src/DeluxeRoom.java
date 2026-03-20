class DeluxeRoom extends Room {

    DeluxeRoom(int availableRooms) {
        super("Deluxe Room", 4000, availableRooms);
    }

    void displayDetails() {
        System.out.println(type + " | Price: ₹" + price + " | Available: " + availableRooms);
    }
}
