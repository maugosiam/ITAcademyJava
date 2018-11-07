public class Overloading {
    public static void main(String args[]){

        for(int i = 0; i<20; i++){

            Tree t = new Tree(i);
            t.info();
            t.info("METODA PRZECIĄŻONA\t");
        }
        new Tree();
    }
}
