public class CompareCircles {
    public static void main(String args[]){
        Circle circle01 = new Circle();
        Circle circle02 = new Circle();
        Circle circle03 = new Circle();

        circle01.radius = 5;
        circle02.radius = 7;
        circle03.radius = 9;

        System.out.println("Długości okręgów 1, 2 i 3 to: "+circle01.lenghtCounting(circle01.radius)+" ,"+circle02.lenghtCounting(circle02.radius)+" i "+circle03.lenghtCounting(circle03.radius));


        /*if ((circle01.lenghtCounting(circle01.radius) > circle02.lenghtCounting(circle02.radius)) && ((circle01.lenghtCounting(circle01.radius) > circle03.lenghtCounting(circle03.radius)))){
            System.out.println("First Circle is the biggest");
        }
        if ((circle02.lenghtCounting(circle02.radius) > circle01.lenghtCounting(circle01.radius)) && ((circle02.lenghtCounting(circle02.radius) > circle03.lenghtCounting(circle03.radius)))){
            System.out.println("Second Circle is the biggest");
        }
        if ((circle03.lenghtCounting(circle03.radius) > circle01.lenghtCounting(circle01.radius)) && ((circle02.lenghtCounting(circle02.radius) < circle03.lenghtCounting(circle03.radius)))){
            System.out.println("Third Circle is the biggest");
        }*/
    }

    public Circle comparingCircles(){
        return (cir)
    }

}
