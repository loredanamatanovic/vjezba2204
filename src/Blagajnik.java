public class Blagajnik extends Osoba  {




    public int brojBlagajne = (int) (Math.random() * 7);

    public Blagajnik(String ime, String prezime, String oib, int brojBlagajne) {
        super(ime, prezime, oib);
    }

     public int getBrojBlagajne() {
        return this.brojBlagajne;
     }
     public void setBrojBlagajne() {
        this.brojBlagajne = brojBlagajne;
     }


    public void prikaziPodatke() {
        System.out.println("Podaci o blagajniku: ");
        System.out.println("Ime: " + ime + "Prezime: " + "Oib: " + oib + "Blagajna: " + brojBlagajne);

    }
}

