public class SignatureExample {

    // Signature: printMessage(String)
    public static void printMessage(String message) {
        System.out.println("Message: " + message);
    }

    // Signature: printMessage(int)
    public static void printMessage(int number) {
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {
        printMessage("Hello!");  // Calls printMessage(String)
        printMessage(42);        // Calls printMessage(int)
    }
}
