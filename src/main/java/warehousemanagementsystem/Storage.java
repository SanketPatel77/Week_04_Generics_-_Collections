package warehousemanagementsystem;

import java.util.ArrayList;
import java.util.List;

/**
 * Generic Storage class to store and manage warehouse items.
 * It ensures type safety by allowing only items that extend WarehouseItem.
 */
public class Storage<T extends WarehouseItem> {

    // List to store warehouse items of type T
    private List<T> itemList = new ArrayList<>();

    //Stores an item in the storage.
    public void store(T item) {
        itemList.add(item);
    }

    /**
     * Retrieves the list of stored items.
     * Returns a list containing all stored warehouse items.
     */
    public List<T> getItem() {
        return itemList;
    }

    /**
     * Displays all warehouse items stored in the system.
     * This method uses wildcards to accept a list of any type that extends WarehouseItem.
     * Prints each item in the provided list.
     */
    public void displayItems(List<? extends WarehouseItem> itemList) {
        System.out.println("Warehouse Items:");
        for (WarehouseItem item : itemList) {
            System.out.println(item);
        }
    }
}
