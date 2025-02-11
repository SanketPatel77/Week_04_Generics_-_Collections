package warehousemanagementsystem;

public class WarehouseManagementSystem {
    public static void main(String[] args) {

        // Creating storage instances for different item categories
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        // Storing electronics items
        electronicsStorage.store(new Electronics(101, "Smart phone", 25000, "OnePlus"));
        electronicsStorage.store(new Electronics(102, "Watch", 20000, "Apple"));
        electronicsStorage.store(new Electronics(103, "Laptop", 50000, "Dell"));
        electronicsStorage.store(new Electronics(104, "Mouse", 2000, "Logitech"));

        // Storing grocery items
        groceriesStorage.store(new Groceries(201, "Milk", 55, "2025-02-11"));
        groceriesStorage.store(new Groceries(202, "Bread", 20, "2025-02-12"));
        groceriesStorage.store(new Groceries(203, "Eggs", 5.0, "2025-02-30"));
        groceriesStorage.store(new Groceries(204, "Apples", 100.0, "2025-02-20"));

        // Storing furniture items
        furnitureStorage.store(new Furniture(301, "Chair", 45.0, "Wood"));
        furnitureStorage.store(new Furniture(302, "Table", 150.0, "Metal"));
        furnitureStorage.store(new Furniture(303, "Sofa", 600.0, "Leather"));
        furnitureStorage.store(new Furniture(304, "Bed", 900.0, "Wood"));

        // Displaying all stored electronics items
        electronicsStorage.displayItems(electronicsStorage.getItem());

        // Displaying all stored groceries items
        electronicsStorage.displayItems(groceriesStorage.getItem());

        // Displaying all stored furniture items
        electronicsStorage.displayItems(furnitureStorage.getItem());
    }
}
