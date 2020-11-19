public class uczen extends human
{
    String zachowanie;
    double srednia;
    boolean zaliczenie_roku;

    public uczen(String name, String surname, int age, String hair_color, String kolor_skory, String kolor_oczu, String zachowanie, double srednia, boolean zaliczenie_roku) {
        super(name, surname, age, hair_color, kolor_skory, kolor_oczu);
        this.zachowanie = zachowanie;
        this.srednia = srednia;
        this.zaliczenie_roku = zaliczenie_roku;
    }

    public String getZachowanie() {
        return zachowanie;
    }

    public void setZachowanie(String zachowanie) {
        this.zachowanie = zachowanie;
    }

    public double getSrednia() {
        return srednia;
    }

    public void setSrednia(double srednia) {
        this.srednia = srednia;
    }

    public boolean isZaliczenie_roku() {
        return zaliczenie_roku;
    }

    public void setZaliczenie_roku(boolean zaliczenie_roku) {
        this.zaliczenie_roku = zaliczenie_roku;
    }
}
