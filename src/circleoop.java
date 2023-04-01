public class circleoop {
    private String color = "red";
    private int radius;

    public circleoop() {
        this.radius = 5;
    }

    public double area() {
        return 3.14 * radius * radius;
    }

    public double perimeter() {
        return 2 * 3.14 * radius;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        circleoop myCircle = new circleoop();
        System.out.println("Area of the circle: " + myCircle.area());
        System.out.println("Perimeter of the circle: " + myCircle.perimeter());
        System.out.println("Color of the circle: " + myCircle.getColor());
    }
}

