public class Customer {

    private String name;
    private double currencyAmount;
    private ShoppingCart cart = null;


    private ShoppingCart shoppingCart;

    Customer(String name, double currencyAmount )
    {
        this.name = name;
        this.currencyAmount = currencyAmount;
        cart = new ShoppingCart(this);
    }

    public void pay()
    {
        // TODO
    }

    public void pack(Box box)
    {
        // TODO
    }

    public void get(Flower f)
    {
        // TODO add to shopping cart etc.
        cart.addFlower(f);
    }

    public ShoppingCart getShoppingCart()
    {
        return shoppingCart;
    }

    public float getCash()
    {
        // TODO calculate cash
        return 0.0f;
    }

    public String getName() {
        return name;
    }



}
