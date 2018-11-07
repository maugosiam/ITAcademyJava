public class Cat {

    private int speed;
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        if (speed<0){
            speed =0;
        }
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }
}
