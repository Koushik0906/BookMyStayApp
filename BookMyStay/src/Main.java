public class Main {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();
        inventory.addRoom("Standard Room", 1); // only ONE room

        // multiple users trying at same time
        Thread t1 = new Thread(new BookingTask(
                new Reservation("Alice", "Standard Room"), inventory));

        Thread t2 = new Thread(new BookingTask(
                new Reservation("Bob", "Standard Room"), inventory));

        Thread t3 = new Thread(new BookingTask(
                new Reservation("Charlie", "Standard Room"), inventory));

        // start threads
        t1.start();
        t2.start();
        t3.start();
    }
}
