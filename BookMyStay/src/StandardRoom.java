class StandardRoom extends Room {

    StandardRoom(int availableRooms) {
        super("Standard Room", 2000, availableRooms);
    }

    void displayDetails() {
        System.out.println(type + " | Price: ₹" + price + " | Available: " + availableRooms);
    }
}
