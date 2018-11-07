public class Circle {

    private int radius;
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(int radius) {
        if (radius<0){
            radius =0;
        }
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getCircleLenght() {
        return (radius *2 * Math.PI);
    }

    public double getArea() {
        return (radius * Math.PI);
    }
}