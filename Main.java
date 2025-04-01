public class Main {
    public static void main(String[] args) {
        SystemRezerwacji system = new SystemRezerwacji();

        Wydarzenie koncert = new Wydarzenie("Koncert Gips", 120.0);
        Wydarzenie teatr = new Wydarzenie("Drive", 85.0);
        system.dodajWydarzenie(koncert);
        system.dodajWydarzenie(teatr);

        Klient klient1 = new Klient("Jan", "Kowak", "jan@gmail.com");
        system.dodajKlienta(klient1);

        klient1.dodajRezerwację(koncert);
        klient1.dodajRezerwację(teatr);

        klient1.wyświetlRezerwacje();
    }
}