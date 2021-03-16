public class Square implements Shapes {
    private int square;
    private double areaSquare;

    public Square(int square) {
        this.square = square;
        areaSquare = area();
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public double getAreaSquare() {
        return areaSquare;
    }

    public void setAreaSquare(double areaSquare) {
        this.areaSquare = areaSquare;
    }

    @Override
    public double area() {
        return square * square;
    }
}
