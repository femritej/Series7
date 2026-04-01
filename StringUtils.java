public class StringUtils {

    // Returns the first letter of a word
    public static String firstLetter(String s) {
        return s.substring(0, 1);
    }

    // Returns the last letter of a word
    public static String lastLetter(String s) {
        return s.substring(s.length() - 1);
    }

    // Overloaded: repeat a String
    public static String repeat(String s, int times) {
        String result = "";
        for (int i = 0; i < times; i++) {
            result += s;
        }
        return result;
    }

    // Overloaded: repeat a char
    public static String repeat(char c, int times) {
        String result = "";
        for (int i = 0; i < times; i++) {
            result += c;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(firstLetter("computer"));
        System.out.println(lastLetter("banana"));
        System.out.println(repeat("Hi", 3));
        System.out.println(repeat('*', 5));
    }
}
