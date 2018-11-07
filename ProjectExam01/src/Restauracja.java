public class Restauracja {

    public static void main(String args[]){

        Order[] stolik01 = new Order[3];
        Order[] stolik02 = new Order[3];
        Order[] stolik03 = new Order[3];

        stolik01[0] = new Order("lazania", 4);
        stolik01[1] = new Order("pierogi leniwe", 33);
        stolik01[2] = new Order("kaczka po pekińsku", 8);
        stolik02[0] = new Order("pizza", 3);
        stolik02[1] = new Order("karczek z ziemniakami", 6);
        stolik02[2] = new Order("woda gazowana", 11);

        System.out.println("Zamównie ze stolika 1");
        for(int i = 0;i<stolik01.length;i++) {
            System.out.println(stolik01[i]);
        }


        System.out.println("\nZamównie ze stolika 2");
        for(int i = 0;i<stolik01.length;i++) {
            System.out.println(stolik02[i]);
        }

    }
}
