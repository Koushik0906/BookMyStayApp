import java.util.*;

class AddOnServiceManager {

    private HashMap<String, List<AddOnService>> serviceMap = new HashMap<>();

    // add services to reservation
    public void addServices(String reservationId, List<AddOnService> services) {
        serviceMap.put(reservationId, services);
    }

    // calculate total cost
    public int calculateTotalCost(String reservationId) {

        List<AddOnService> services = serviceMap.get(reservationId);

        int total = 0;

        if (services != null) {
            for (AddOnService s : services) {
                total += s.price;
            }
        }

        return total;
    }

    // display services
    public void displayServices(String reservationId) {

        List<AddOnService> services = serviceMap.get(reservationId);

        System.out.println("\nAdd-On Services for Reservation " + reservationId + ":");

        if (services == null || services.isEmpty()) {
            System.out.println("No services selected.");
            return;
        }

        for (AddOnService s : services) {
            System.out.println(s.serviceName + " - ₹" + s.price);
        }
    }
}
