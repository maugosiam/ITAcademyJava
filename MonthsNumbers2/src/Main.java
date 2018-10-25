import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int x = 12;
        System.out.println("\n"+"Hi! Give me the int number from range 1 - 12, pls");
        Scanner y = new Scanner(System.in);
        x = y.nextInt();
        String miesiac = grading(x);
        System.out.println("Month number "+x+" is "+miesiac);
    }

    public static String grading(int x) {
        String miesiac = "... I don't know!";
        switch (x) {
            case 1:
                miesiac = "January, brrr cold";
                break;
            case 2:
                miesiac = "Febuary, brrr cold";
                break;
            case 3:
                miesiac = "March, spring is comming";
                break;
            case 4:
                miesiac = "April, prima Aprilis";
                break;
            case 5:
                miesiac = "May, the most beautifull time a year";
                break;
            case 6:
                miesiac = "June, holidays!";
                break;
            case 7:
                miesiac = "July, holidays!";
                break;
            case 8:
                miesiac = "August, still hot!";
                break;
            case 9:
                miesiac = "September, golden polish fall :)";
                break;
            case 10:
                miesiac = "October, I hate it!";
                break;
            case 11:
                miesiac = "November, I can't wait for Christmas";
                break;
            case 12:
                miesiac = "December, Santa Claus is comming to town! :)";
                break;

            default:
                System.out.println("\n"+"Wooooow. Really? You really think month number "+x+" exists?");
                break;
        }
    return miesiac;
    }
}
