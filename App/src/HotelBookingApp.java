public class HotelBookingApp {
    public static void main(String[] args) {

        // Creating room objects
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        // Static availability variables
        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        System.out.println("Hotel Room Initialization");

        System.out.println("\nSingle Room:");
        singleRoom.displayRoomDetails();
        System.out.println("Available: " + singleAvailable);

        System.out.println("\nDouble Room:");
        doubleRoom.displayRoomDetails();
        System.out.println("Available: " + doubleAvailable);

        System.out.println("\nSuite Room:");
        suiteRoom.displayRoomDetails();
        System.out.println("Available: " + suiteAvailable);
    }
}