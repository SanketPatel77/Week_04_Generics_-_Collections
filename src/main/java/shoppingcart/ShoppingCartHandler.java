package shoppingcart;

public class ShoppingCartHandler {
    public static void main(String[] args) {

        // creating cart
        Cart cart = new Cart();

        // adding items into cart
        cart.addItem( new Item("Mouse", 100));
        cart.addItem( new Item("Keyboard", 200));
        cart.addItem( new Item("Smarphone", 10_000));
        cart.addItem( new Item("KeyChain", 10));

        // displaying items
        System.out.println("Displaying items :-");
        cart.displayItem();

        // displaying items by order of insertion
        System.out.println("Displaying items by order of insertion :-");
        cart.displayItemByOrder();

        // displaying items by price
        System.out.println("Displaying items by price :-");
        cart.displayItemByPrice();

    }
}