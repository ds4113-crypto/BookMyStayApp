import java.util.*;

public class RoomInventory {

    private Map<String, Integer> rooms;

    public RoomInventory() {
        rooms = new HashMap<>();
        rooms.put("Single", 5);
        rooms.put("Double", 3);
        rooms.put("Suite", 2);
    }

    public void incrementRoom(String roomType) {
        rooms.put(roomType, rooms.getOrDefault(roomType, 0) + 1);
    }

    public int getAvailability(String roomType) {
        return rooms.getOrDefault(roomType, 0);
    }
}