import java.time.LocalDate;

public class Car {
    String marka;
    String nrRejestracyjny; //do rozszerzenia na koleją klasę skłądającą się ze strina i liczby
    String kolor;
    int liczbaMiejsc;
    int przebiegWkm;
    LocalDate dataOstatniegoPrzegladu;
    boolean wypozyczony;

    public Car(String marka, String nrRejestracyjny, String kolor, int liczbaMiejsc, int przebiegWkm, LocalDate dataOstatniegoPrzegladu, boolean wypozyczony) {
        this.marka = marka;
        this.nrRejestracyjny = nrRejestracyjny;
        this.kolor = kolor;
        this.liczbaMiejsc = liczbaMiejsc;
        this.przebiegWkm = przebiegWkm;
        this.dataOstatniegoPrzegladu = dataOstatniegoPrzegladu;
        this.wypozyczony = wypozyczony;
    }


    public String toString(){
        return "Marka: "+marka +",\tNumer rejestracyjny: "+ nrRejestracyjny+",\t Kolor: "+kolor+",\t Liczba miejsc: "+liczbaMiejsc+",\t Przebieg: "+przebiegWkm+",\t Data Ostatniego przeglądu: "+dataOstatniegoPrzegladu+",\t Wypożyczony: "+wypozyczony;
    }

    public boolean czyPrzegladWazny(){
        if (dataOstatniegoPrzegladu.isAfter(LocalDate.now())){
            return false;
        }
        else return true;
    }
}
