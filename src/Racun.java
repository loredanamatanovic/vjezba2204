public abstract class Racun extends Blagajnik {


    //kupac, blagajnik i iznos računa

    int iznosRacuna;

    public Racun(String imeKupca, String prezimeKupca, int oib, int brojBlagajne, int iznosRačuna) {
        super(imeKupca, prezimeKupca, oib, brojBlagajne);
    }

    public int getIznosRacuna() {
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

