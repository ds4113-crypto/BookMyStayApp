import java.util.*;

public class RoomInventory {

    private Map<String, Integer> rooms;

    public RoomInventory() {
        rooms = new HashMap<>();
        rooms.put("Single", 5);
        rooms.put("Double", 3);
        rooms.put("Suite", 2);
    }

    public void setRoom(String roomType, int count) {
        rooms.put(roomType, count);
    }

    public int getAvailability(String roomType) {
        return rooms.getOrDefault(roomType, 0);
    }

    public Map<String, Integer> getAllRooms() {
        return rooms;
    }

    public void displayInventory() {
        System.out.println("Current Inventory:");
        rooms.forEach((type, count) -> System.out.println(type + ": " + count));
    }
}