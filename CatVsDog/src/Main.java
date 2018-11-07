public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        cat.setSpeed(50);
        dog.setSpeed(10);

        cat.setColor("grey");
        dog.setColor("yellow");

        System.out.printf("\nThe %s cat runs %d mph", cat.getColor(), cat.getSpeed());
        System.out.printf("\nThe %s dog runs %d mph", dog.getColor(), dog.getSpeed());

        if (comparing(cat.getSpeed(),dog.getSpeed())){
            System.out.println("\nThe cat is faster!");
        }
            else
                System.out.println("\nThe dog is faster!");
    }
    public static boolean comparing (int a, int b){
        if (a>b)
            return true;
        else
            return false;
    }
}



