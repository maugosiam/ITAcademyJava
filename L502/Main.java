public class Main {

    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuwxyz";
        System.out.println(s.length());
        System.out.println("na miejscu 20 w tym stringu jest literka: "+s.charAt(20));
        System.out.println("Literka w jest na miejscu: "+s.indexOf("wa"));
        System.out.println(s.substring(3,7));
        char tabela[] = new char[s.length()];
        for (int i=0; i<s.length();i++){
            tabela[i]= s.charAt(i);
            System.out.print(" "+tabela[i]);
        }
        System.out.println();
        for (int i=s.length()-1; i>=0;i--){
            tabela[i]= s.charAt(i);
            System.out.print(" "+tabela[i]);
        }
    }
}
