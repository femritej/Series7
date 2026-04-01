public class AreaCalculator {

    // Area of a square
    public static int area(int side) {
        return side * side;
    }

    // Area of a rectangle
    public static int area(int width, int height) {
        return width * height;
    }

    // Area of a circle
    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        System.out.println(area(5));          // square
        System.out.println(area(4, 6));       // rectangle
        System.out.println(area(3.0));        // circle
    }
}
