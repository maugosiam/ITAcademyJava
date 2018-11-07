import java.io.*;

class Main {

    static void printPattern(int n)
    {
        int line = 1;
        int star = n;

        //System.out.println ("\n"+n+" Stars");
        for ( line = 0; line < n;) {
            if (star == (line + n) && line != n) {
                System.out.println("\n" + star + " Stars");
                line++;
                star = n;
            }
            if (star >= line) {
                System.out.print("*");
                star--;
            }
        }
    }

    public static void main (String[] args)
    {
        printPattern(5);
    }
}