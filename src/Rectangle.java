public class Rectangle implements Shapes {
    private int rectangle1;
    private int rectangle2;
    private double areaRect;

    public Rectangle(int rectangle1, int rectangle2) {
        this.rectangle1 = rectangle1;
        this.rectangle2 = rectangle2;
        areaRect = area();
    }

    public int getRectangle1() {
        return rectangle1;
    }

    public void setRectangle1(int rectangle1) {
        this.rectangle1 = rectangle1;
    }

    public int getRectangle2() {
        return rectangle2;
    }

    public void setRectangle2(int rectangle2) {
        this.rectangle2 = rectangle2;
    }

    public double getAreaRect() {
        return areaRect;
    }

    public void setAreaRect(double areaRect) {
        this.areaRect = areaRect;
    }

    @Override
    public double area() {

        return this.rectangle1 * this.rectangle2;
    }
}

