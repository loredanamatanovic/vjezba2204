public class Kupac extends Osoba   {

    public double saldoNaRacunu;

    public Kupac(String ime, String prezime, int oib, double saldoNaRacunu) {
        super(ime, prezime, oib);
    }

    public double getSaldoNaRacunu() {
        return this.saldoNaRacunu;
    }

    public void setSaldoNaRacunu(double saldoNaRacunu) {
        this.saldoNaRacunu = saldoNaRacunu;
    }

    public void prikaziPodatke() {
        System.out.println("Podaci o kupcu:");
        System.out.println("Ime: " + ime + "Prezime: " + "Oib: " + oib + "Saldo na računu je " + saldoNaRacunu);
    }
}
