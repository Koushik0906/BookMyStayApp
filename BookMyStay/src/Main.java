import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Add-On Services Demo");

        AddOnServiceManager manager = new AddOnServiceManager();

        String reservationId = "STA1";

        // create services
        List<AddOnService> services = new ArrayList<>();
        services.add(new AddOnService("Breakfast", 500));
        services.add(new AddOnService("WiFi", 200));
        services.add(new AddOnService("Airport Pickup", 1000));

        // add to reservation
        manager.addServices(reservationId, services);

        // display
        manager.displayServices(reservationId);

        // total cost
        int total = manager.calculateTotalCost(reservationId);
        System.out.println("Total Add-On Cost: ₹" + total);
    }
}
