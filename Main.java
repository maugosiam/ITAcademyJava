import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n"+"Hi! Give me radius, pls");
        Scanner x = new Scanner(System.in);
        float r = x.nextInt();

        System.out.print("\nRadius of our circle is: "+r);
        float circleLengh = (float) calculateCircleLengh(r);
        System.out.println(" and circle lengh is: "+circleLengh);
    }

    public static float calculateCircleLengh(float r){
        float circleLengh;
        circleLengh = 2f * 3.14f * r;
        return circleLengh;
    }

}
