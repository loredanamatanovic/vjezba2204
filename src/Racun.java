public class Racun extends Blagajnik {


    //kupac, blagajnik i iznos računa

    int iznosRacuna;

    public Racun(String imeKupca, String prezimeKupca, String imeBlagajnika, String prezimeBlagajnika, int oib, int brojBlagajne, double iznosRačuna) {
        super(imeKupca, prezimeKupca, oib, brojBlagajne);
    }

    public double getIznosRacuna() {
        return this.iznosRacuna;
    }
    public void setIznosRacuna() {
        this.iznosRacuna = iznosRacuna;
    }

    @Override
    public void prikaziPodatke() {
        System.out.println("Ime: " + ime + "Prezime: " + prezime + "Blagajna: " + brojBlagajne + "Iznos: " + iznosRacuna);





    }
}

