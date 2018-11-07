public class Main {

    public static void main(String[] args) {
        String s = "abababzzzzzzzzzzzzzzzzzzzzzzzzzab";
        int licznik = 0;
        while (s.indexOf("ab") != -1){
            licznik++;
            s = s.substring(s.indexOf("ab")+"ab".length(), s.length());
        }
        System.out.println("\nab wystąpiło "+licznik+" razy");
    }
}
