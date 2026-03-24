public class RoomAllocationService {

    private Map<String, Integer> allocatedCount = new java.util.HashMap<>();

    public void allocateRoom(Reservation reservation, RoomInventory inventory) {

        String roomType = reservation.getRoomType();

        int current = allocatedCount.getOrDefault(roomType, 0) + 1;
        allocatedCount.put(roomType, current);

        reservation.setRoomId(roomType + "-" + current);

        inventory.decrementRoom(roomType);

        System.out.println("Booking confirmed for Guest: " + reservation.getGuestName() +
                ", Room ID: " + reservation.getRoomId());
    }
}