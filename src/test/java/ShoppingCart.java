import java.util.HashMap;
import java.util.Map;

public class ShoppingCart  extends  Container{

    public Map<Flower, Integer> flowersList = new HashMap<Flower, Integer>();
//    public Map<Flower,Integer> flowersList = null;
//
    private PriceList priceList = PriceList.getInstance();

    private Customer c;


    public ShoppingCart(Customer c) {
        super(c);
        this.c=c;
        flowersList = new HashMap<Flower,Integer>();
    }

    public String toString()
    {
        // TODO
        return "lista produktow";
    }

    public Map<Flower, Integer> getFlowersList() {
        return flowersList;
    }


    public void addFlower(Flower f) {
        flowersList.put(f,f.getIlosc());
    }

}
