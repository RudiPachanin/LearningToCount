class Circle implements Shapes {
    private double radius;
    private double areaCircle;

    public Circle(double radius) {
        this.radius = radius;
        areaCircle = area();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getAreaCircle() {
        return areaCircle;
    }

    public void setAreaCircle(double areaCircle) {
        this.areaCircle = areaCircle;
    }

    @Override
    public double area() {
        return 3.14 * radius * radius;
    }
}
