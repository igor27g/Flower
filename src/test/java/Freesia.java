public class Freesia extends Flower {

    public Freesia(String nazwa, double cena){ super(nazwa,cena);}

    public Freesia(int ilosc) { super(ilosc); }

    String getNazwa() { return "bez"; }

    Integer getIlosc() { return super.ilosc; }

    String getKolor() { return "biały"; }

    double getCena(){ return super.cena; };

}

