public class Peony extends Flower {

    public Peony(String nazwa, double cena){ super(nazwa,cena);}

    public Peony(int ilosc) { super(ilosc); }

    String getNazwa() { return "piwonia"; }

    Integer getIlosc() { return ilosc; }

    String getKolor() { return "czerwony"; }

    double getCena(){ return cena; };
}
