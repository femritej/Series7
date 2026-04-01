public class MathUtils {

    // Doubles a number
    public static int doubleValue(int x) {
        return x * 2;
    }

    // Triples a number
    public static int tripleValue(int x) {
        return x * 3;
    }

    // Overloaded: doubles a double
    public static double doubleValue(double x) {
        return x * 2;
    }

    // A method that uses other methods (method chaining)
    public static int doubleThenTriple(int x) {
        int doubled = doubleValue(x);   // calls int version
        return tripleValue(doubled);
    }

    public static void main(String[] args) {
        System.out.println(doubleThenTriple(4));   // 4 → 8 → 24
        System.out.println(doubleValue(3.5));      // calls double version
    }
}
