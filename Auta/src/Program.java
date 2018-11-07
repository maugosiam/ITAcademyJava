import java.time.LocalDate;

public class Program {

    public static void main (String[] args){

        Car car01 = new Car("Ford", "ZSD 123456", "czerwony", 4, 12342, LocalDate.now());
        Car car02 = new Car("Mitsubishi", "DW 123456", "srebrny", 5, 12992, LocalDate.now());

        System.out.println(car01+", Czy przegląda ważny: "+car01.czyPrzegladWazny());
        System.out.println(car02+", Czy przegląda ważny: "+car02.czyPrzegladWazny());
    }
}
