public class AddHelper {

    // Adds two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Adds three numbers (overloaded)
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(add(3, 4));       // Calls add(int, int)
        System.out.println(add(1, 2, 3));    // Calls add(int, int, int)
    }
}
