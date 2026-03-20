abstract class Room {

    String type;
    int price;
    int availableRooms;

    // constructor
    Room(String type, int price, int availableRooms) {
        this.type = type;
        this.price = price;
        this.availableRooms = availableRooms;
    }

    // abstract method
    abstract void displayDetails();
}
