public class Tree {
    int height;

    Tree() {
        height = 0;
        System.out.println("Sadzenie sadzonki");
    }

    Tree(int initialHeight) {
        height = initialHeight;
        System.out.println("\nTworzenie nowego drzewa na "+height+" metrów.");
    }

    void info(){
        System.out.println("Drzewo ma "+height+ " metrów wysokości.");
    }

    void info(String s){
        System.out.println(s+": drzewo ma "+height+ " metrów wysokości");
    }
}


