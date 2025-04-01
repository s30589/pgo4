import java.util.ArrayList;

class Wydarzenie {
    private String nazwa;
    private String data;
    private String miejsce;
    private int maxLiczbaMiejsc = 100;
    private int dostępneMiejsca = 0;
    private double cena;

    public Wydarzenie(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public Wydarzenie(String nazwa, double cena, String data) {
        this(nazwa, cena);
        this.data = data;
    }

    public Wydarzenie(String nazwa, double cena, String data, String miejsce) {
        this(nazwa, cena, data);
        this.miejsce = miejsce;
    }

    public String getNazwa() { return nazwa; }
    public double getCena() { return cena; }
    public void setCena(double cena) { this.cena = cena; }

    public void zarezerwujMiejsce() {
        if (dostępneMiejsca < maxLiczbaMiejsc) {
            dostępneMiejsca++;
        }
    }

    @Override
    public String toString() {
        return "Wydarzenie: " + nazwa + ", Data: " + data + ", Miejsce: " + miejsce + ", Cena: " + cena;
    }
}