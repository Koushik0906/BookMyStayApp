class SuiteRoom extends Room {

    SuiteRoom(int availableRooms) {
        super("Suite Room", 7000, availableRooms);
    }

    void displayDetails() {
        System.out.println(type + " | Price: ₹" + price + " | Available: " + availableRooms);
    }
}
