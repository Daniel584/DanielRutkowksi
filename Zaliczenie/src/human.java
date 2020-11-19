public class human
{
 String name;
 String surname;
 int age;
 String hair_color;
 String kolor_skory;
 String kolor_oczu;

    public human(String name, String surname, int age, String hair_color, String kolor_skory, String kolor_oczu) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.hair_color = hair_color;
        this.kolor_skory = kolor_skory;
        this.kolor_oczu = kolor_oczu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHair_color() {
        return hair_color;
    }

    public void setHair_color(String hair_color) {
        this.hair_color = hair_color;
    }

    public String getKolor_skory() {
        return kolor_skory;
    }

    public void setKolor_skory(String kolor_skory) {
        this.kolor_skory = kolor_skory;
    }

    public String getKolor_oczu() {
        return kolor_oczu;
    }

    public void setKolor_oczu(String kolor_oczu) {
        this.kolor_oczu = kolor_oczu;
    }
}

