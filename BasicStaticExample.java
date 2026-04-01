
public class BasicStaticExample {

    // A simple static method that returns the double of a number.
    public static int doubleValue(int x) {
        return x * 2;
    }

    public static void main(String[] args) {
        int result = doubleValue(5);  // Calls the static method
        System.out.println("Double of 5 is: " + result);
    }
}
