import java.util.*;

class CancellationService {

    private Stack<String> rollbackStack = new Stack<>();

    public void cancelReservation(String roomId,
                                  BookingHistory history,
                                  RoomInventory inventory) {

        Reservation target = null;

        // find reservation
        for (Reservation r : history.getAllReservations()) {
            if (r.roomId.equals(roomId)) {
                target = r;
                break;
            }
        }

        // validation
        if (target == null) {
            System.out.println("Cancellation Failed: Reservation not found");
            return;
        }

        if (target.isCancelled) {
            System.out.println("Cancellation Failed: Already cancelled");
            return;
        }

        // rollback steps
        rollbackStack.push(roomId);  // track released ID

        inventory.incrementRoom(target.roomType); // restore inventory

        target.cancel(); // mark cancelled

        System.out.println("Cancellation Successful for Room ID: " + roomId);
    }

    // optional: view rollback stack
    public void showRollbackStack() {
        System.out.println("\nRollback Stack:");
        for (String id : rollbackStack) {
            System.out.println(id);
        }
    }
}
