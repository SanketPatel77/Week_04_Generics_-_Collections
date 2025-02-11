package warehousemanagementsystem;

// Abstract class representing an item stored in the warehouse
public abstract class WarehouseItem {

    // Unique identifier for each warehouse item
    private int id;

    // Name of the item
    private String name;

    // Price of the item
    private double price;

    // Constructor to initialize warehouse item properties
    public WarehouseItem(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getter method to retrieve the item ID
    public int getId() {
        return id;
    }

    // Setter method to update the item ID
    public void setId(int id) {
        this.id = id;
    }

    // Getter method to retrieve the item name
    public String getName() {
        return name;
    }

    // Setter method to update the item name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method to retrieve the item price
    public double getPrice() {
        return price;
    }

    // Setter method to update the item price
    public void setPrice(double price) {
        this.price = price;
    }

    // Overridden toString() method to provide a string representation of the item
    @Override
    public String toString() {
        return "WarehouseItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price;
    }
}
