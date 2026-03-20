public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Hotel Booking Application\n");

        // create room objects
        Room standard = new StandardRoom(10);
        Room deluxe = new DeluxeRoom(5);
        Room suite = new SuiteRoom(2);

        // display details
        standard.displayDetails();
        deluxe.displayDetails();
        suite.displayDetails();
    }
}
