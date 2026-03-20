class RoomInventory {

    private HashMap<String, Integer> inventory = new HashMap<>();

    public synchronized void addRoom(String type, int count) {
        inventory.put(type, count);
    }

    public synchronized int getAvailability(String type) {
        return inventory.getOrDefault(type, 0);
    }

    public synchronized boolean allocateRoom(String type) {

        int count = inventory.getOrDefault(type, 0);

        if (count > 0) {
            inventory.put(type, count - 1);
            return true;
        }

        return false;
    }
}
