public class Osoba {

    public String ime;
    public String prezime;
    public int oib;

    public Osoba(String ime, String prezime, int oib) {
        this.ime = ime;
        this.prezime = prezime;
        this.oib = oib;
    }

    public String getIme() {
        return this.ime;
    }

    public void setIme() {
        this.ime = ime;
    }

    public String getPrezime() {
        return this.prezime;
    }

    public void setPrezime() {
        this.prezime = prezime;
    }

    public int getOib() {
        return this.oib;
    }

    public void setOib() {
        this.oib = oib;
    }


    public void prikaziPodatke() {
        System.out.println("Ime: " + ime + "Prezime: " + "Oib: " + oib);
    }

}
