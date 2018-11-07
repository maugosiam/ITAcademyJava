public class Square {
    public static int numberOfFigures;

    private int sideLength;
    public int getSideLength() {
        return sideLength;
    }

    public String anotherColor;
    private String color = "Transparent";

    public boolean equals(Square square) {
        if (this.sideLength==square.sideLength && this.color.equals(square.color))
            return true;
        else
            return false;
    }

    public static int getNumberOfFigures() {
        return numberOfFigures;
    }

    public void setSideLength(int sideLength) {
        if (sideLength<0){
            sideLength =0;
        }
        this.sideLength = sideLength;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPerimeter() {
        return sideLength * 4;
    }

    public int getArea() {
        return sideLength * sideLength;
    }
}
