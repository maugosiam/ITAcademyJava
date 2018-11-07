public class Order {
    private String dishName;
    private int number;

    public Order(String dishName, int number) {
        this.dishName = dishName;
        this.number = number;
    }


    public String toString(){
        return dishName+" "+number;
    }
}
