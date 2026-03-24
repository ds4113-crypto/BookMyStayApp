public class UC12DataPersistenceRecovery {

    public static void main(String[] args) {

        System.out.println("System Recovery");

        String inventoryFile = "inventory.txt";

        RoomInventory inventory = new RoomInventory();
        FilePersistenceService persistence = new FilePersistenceService();

        persistence.loadInventory(inventory, inventoryFile);

        inventory.displayInventory();

        persistence.saveInventory(inventory, inventoryFile);
    }
}