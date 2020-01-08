import java.util.ArrayList;
import java.util.List;

public class ShoppingCart  extends  Container{

   private List<Flower> flowersList = new ArrayList<Flower>();

    private PriceList priceList = PriceList.getInstance();

    private Customer c;


    public ShoppingCart(Customer c) {
        super(c);
        this.c=c;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        System.out.print("Wózek właściciel " + c.getName());
        for(int i =0; i < flowersList.size(); i++) {
            sb.append(flowersList.get(i));
            if(i<flowersList.size() - 1)
            {
            sb.append(" , ");
            }
        }
        return  sb.toString();
//         TODO
//        return "lista produktow";
    }


    public List<Flower> getFlowerList() {
        return flowersList;
    }

    public void addFlower(Flower f) {
        flowersList.add(f);
    }

}
