import java.time.LocalDate;

public class Car {
    private String marka;
    private String nrRejestracyjny; //do rozszerzenia na koleją klasę skłądającą się ze strina i liczby
    private String kolor;
    private int liczbaMiejsc;
    private int przebiegWkm;
    private LocalDate dataOstatniegoPrzegladu;
    private boolean wypozyczony;

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
        return "Marka: "+marka +",Numer rejestracyjny: "+ nrRejestracyjny+", Kolor: "+kolor+", Liczba miejsc: "+liczbaMiejsc+", Przebieg: "+przebiegWkm+", Data Ostatniego przeglądu: "+dataOstatniegoPrzegladu+",\t Wypożyczony: "+wypozyczony;
    }

    public boolean czyPrzegladWazny(){
        if (dataOstatniegoPrzegladu.isAfter(LocalDate.now())){
            return false;
        }
        else return true;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getNrRejestracyjny() {
        return nrRejestracyjny;
    }

    public void setNrRejestracyjny(String nrRejestracyjny) {
        this.nrRejestracyjny = nrRejestracyjny;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public int getLiczbaMiejsc() {
        return liczbaMiejsc;
    }

    public void setLiczbaMiejsc(int liczbaMiejsc) {
        this.liczbaMiejsc = liczbaMiejsc;
    }

    public int getPrzebiegWkm() {
        return przebiegWkm;
    }

    public void setPrzebiegWkm(int przebiegWkm) {
        this.przebiegWkm = przebiegWkm;
    }

    public LocalDate getDataOstatniegoPrzegladu() {
        return dataOstatniegoPrzegladu;
    }

    public void setDataOstatniegoPrzegladu(LocalDate dataOstatniegoPrzegladu) {
        this.dataOstatniegoPrzegladu = dataOstatniegoPrzegladu;
    }

    public boolean isWypozyczony() {
        return wypozyczony;
    }

    public void setWypozyczony(boolean wypozyczony) {
        this.wypozyczony = wypozyczony;
    }


}
