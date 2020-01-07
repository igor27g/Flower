import java.util.Map;

public class PriceList {

    private static String nazwa;
    private static double cena;
    public Map<String, Double> productList = null;

    //Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    private static PriceList instance = null;

    public static PriceList getInstance()
    {
        if( instance == null )
        {
            instance = new PriceList();
        }
        return instance;
    }

    public void put(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
        productList.put(nazwa,cena);
    }

    public double getCena(String nazwa){
        return this.productList.get(nazwa);
    }




}
