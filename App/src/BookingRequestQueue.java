import java.util.*;

public class BookingRequestQueue {

    private Queue<Reservation> queue;

    public BookingRequestQueue() {
        queue = new LinkedList<>();
    }

    public void addRequest(Reservation reservation) {
        synchronized (queue) {
            queue.add(reservation);
        }
    }

    public Reservation pollRequest() {
        synchronized (queue) {
            return queue.poll();
        }
    }

    public boolean isEmpty() {
        synchronized (queue) {
            return queue.isEmpty();
        }
    }
}