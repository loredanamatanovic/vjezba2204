public class Main {
    public static void main(String[] args) {

        Osoba osoba = new Osoba("Marko", "Marković", 0025);
        Blagajnik blagajnik = new Blagajnik("Jura", "Stefanov", 0147, 1);
        Kupac kupac  = new Kupac("Matko", "Matković", 2145, 80);
        new Racun(kupac.getIme(), kupac.getPrezime(), blagajnik.getIme(), blagajnik.getPrezime(), 2154, blagajnik.brojBlagajne, 26.22);
    }
}
