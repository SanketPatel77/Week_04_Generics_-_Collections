package warehousemanagementsystem;

/**
 * Represents a grocery item in the warehouse.
 * Extends the WarehouseItem class to inherit common item properties.
 */
public class Groceries extends WarehouseItem {

    // Expiry date of the grocery item
    private String expiryDate;

    /**
     * Constructor to initialize a grocery item.
     * Calls the superclass constructor to set common properties like id, name, and price.
     * Also initializes the expiry date.
     */
    public Groceries(int id, String name, double price, String expiryDate) {
        super(id, name, price);
        this.expiryDate = expiryDate;
    }

    /**
     * Retrieves the expiry date of the grocery item.
     * Returns the expiry date as a String.
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Overrides the toString() method to provide a formatted string representation of the grocery item.
     * Includes common properties from the superclass and adds expiry date information.
     */
    @Override
    public String toString() {
        return super.toString() + ", Expiry Date: " + expiryDate + "}";
    }
}
