import java.util.*;

public class BookingRequestQueue {

    private Queue<String> queue;

    public BookingRequestQueue() {
        queue = new LinkedList<>();
    }

    public void addRequest(String request) {
        queue.add(request);
    }
}