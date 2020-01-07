public class Rose extends Flower {
    public Rose(String nazwa, double cena){ super(nazwa,cena);}

    public Rose(int ilosc) { super(ilosc); }

    String getNazwa() { return "róża"; }

    Integer getIlosc() { return ilosc; }

    String getKolor() { return "czerwony"; }

    double getCena(){ return cena; };
}
