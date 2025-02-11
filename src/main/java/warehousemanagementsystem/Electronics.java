package warehousemanagementsystem;

import java.util.List;

/**
 * Represents an Electronics item in the warehouse.
 * Extends the WarehouseItem class to inherit common item properties.
 */
public class Electronics extends WarehouseItem {

    // Brand of the electronic item
    private String brand;

    /**
     * Constructor to initialize an Electronics item.
     * Calls the superclass constructor to set common properties like id, name, and price.
     */
    public Electronics(int id, String name, double price, String brand) {
        super(id, name, price);
        this.brand = brand;
    }

    /**
     * Retrieves the brand of the electronic item.
     * Returns the brand as a String.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Overrides the toString() method to provide a formatted string representation of the electronic item.
     * Includes common properties from the superclass and adds the brand information.
     */
    @Override
    public String toString() {
        return super.toString() + ", Brand: " + brand + "}";
    }
}
