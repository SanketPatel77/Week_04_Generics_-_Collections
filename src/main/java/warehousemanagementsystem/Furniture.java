package warehousemanagementsystem;

/**
 * Represents a furniture item in the warehouse.
 * Extends the WarehouseItem class to inherit common item properties.
 */
public class Furniture extends WarehouseItem {

    // Material of the furniture item (e.g., wood, metal, plastic)
    private String material;

    /**
     * Constructor to initialize a furniture item.
     * Calls the superclass constructor to set common properties like id, name, and price.
     * Also initializes the material type.
     */
    public Furniture(int id, String name, double price, String material) {
        super(id, name, price);
        this.material = material;
    }

    /**
     * Retrieves the material of the furniture item.
     * Returns the material as a String.
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Overrides the toString() method to provide a formatted string representation of the furniture item.
     * Includes common properties from the superclass and adds material information.
     */
    @Override
    public String toString() {
        return super.toString() + ", Material: " + material + "}";
    }
}
