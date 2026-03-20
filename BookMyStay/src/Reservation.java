class Reservation {

    String guestName;
    String roomType;
    String roomId;
    boolean isCancelled = false;

    public Reservation(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public void cancel() {
        this.isCancelled = true;
    }

    public void display() {
        System.out.println("Guest: " + guestName +
                " | Room: " + roomType +
                " | Room ID: " + roomId +
                " | Status: " + (isCancelled ? "CANCELLED" : "CONFIRMED"));
    }
}
