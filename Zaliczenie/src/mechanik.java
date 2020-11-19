public class mechanik extends human
{
    int zarobki;
    int ilos_aut;
    String nazwa_firmy;
    int lata_pracy;

    public mechanik(String name, String surname, int age, String hair_color, String kolor_skory, String kolor_oczu, int zarobki, int ilos_aut, String nazwa_firmy, int lata_pracy) {
        super(name, surname, age, hair_color, kolor_skory, kolor_oczu);
        this.zarobki = zarobki;
        this.ilos_aut = ilos_aut;
        this.nazwa_firmy = nazwa_firmy;
        this.lata_pracy = lata_pracy;
    }

    public int getZarobki() {
        return zarobki;
    }

    public void setZarobki(int zarobki) {
        this.zarobki = zarobki;
    }

    public int getIlos_aut() {
        return ilos_aut;
    }

    public void setIlos_aut(int ilos_aut) {
        this.ilos_aut = ilos_aut;
    }

    public String getNazwa_firmy() {
        return nazwa_firmy;
    }

    public void setNazwa_firmy(String nazwa_firmy) {
        this.nazwa_firmy = nazwa_firmy;
    }

    public int getLata_pracy() {
        return lata_pracy;
    }

    public void setLata_pracy(int lata_pracy) {
        this.lata_pracy = lata_pracy;
    }
}
