public class Main {
    public static void main(String[] args) {
        Circle circle01 = new Circle();
        Circle circle02 = new Circle();
        Circle circle03 = new Circle();

        circle01.setRadius(5);
        circle02.setRadius(10);
        circle03.setRadius(15);

        circle01.setColor("Red");
        circle02.setColor("Blue");
        circle03.setColor("Orange");

        System.out.printf("\nArea of circle01 is %.1f, lenght %.1f and color %s", circle01.getArea(), circle01.getCircleLenght(), circle01.getColor());
        System.out.printf("\nArea of circle02 is %.1f, lenght %.1f and color %s", circle02.getArea(), circle02.getCircleLenght(), circle02.getColor());
        System.out.printf("\nArea of circle03 is %.1f, lenght %.1f and color %s\n", circle03.getArea(), circle03.getCircleLenght(), circle03.getColor());
        System.out.printf("\nThe biggest one is with the circle lenght = %.1f. \n", comparing(circle01, circle02, circle03).getCircleLenght());

    }

    public static Circle comparing(Circle a, Circle b, Circle c) {
        if(a.getCircleLenght()>b.getCircleLenght() && a.getCircleLenght()>c.getCircleLenght()){
            return a;
        }
        if(b.getCircleLenght()>a.getCircleLenght() && b.getCircleLenght()>c.getCircleLenght()){
            return b;
        }
        if(c.getCircleLenght()>a.getCircleLenght() && c.getCircleLenght()>b.getCircleLenght()){
            return c;
        }
        return null;
    }
}


