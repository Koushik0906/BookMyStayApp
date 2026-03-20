class BookingValidator {

    public void validate(Reservation reservation, RoomInventory inventory)
            throws InvalidBookingException {

        // check null or empty guest name
        if (reservation.guestName == null || reservation.guestName.isEmpty()) {
            throw new InvalidBookingException("Guest name cannot be empty");
        }

        // check valid room type
        int available = inventory.getAvailability(reservation.roomType);

        if (available == 0 && !inventoryExists(reservation.roomType, inventory)) {
            throw new InvalidBookingException("Invalid room type selected");
        }

        // check availability
        if (available <= 0) {
            throw new InvalidBookingException("No rooms available for selected type");
        }
    }

    // helper method
    private boolean inventoryExists(String roomType, RoomInventory inventory) {
        return inventory.getAvailability(roomType) > 0;
    }
}
