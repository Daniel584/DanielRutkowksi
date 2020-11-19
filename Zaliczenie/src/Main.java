public class Main
{
    public static void main(String[] args)
    {
        uczen uczen1=new uczen("Mati","pudzian",18,"niebieski","normanlny(biały)","niebieski","dobre",4.8,true);

        System.out.println("dane ucznia pierszego \n");
        System.out.println("imie:"+uczen1.getName());
        System.out.println("nazwisko:"+uczen1.getSurname());
        System.out.println("wiek:"+uczen1.getAge());
        System.out.println("kolorwlosow:"+uczen1.getHair_color());
        System.out.println("kolor skory:"+uczen1.getKolor_skory());
        System.out.println("kolor oczu:"+uczen1.getKolor_oczu());
        System.out.println("zachownie:"+uczen1.getZachowanie());
        System.out.println("srednia:"+uczen1.getSrednia());
        System.out.println("czy zaliczył rok?:"+uczen1.isZaliczenie_roku());




    }
}
