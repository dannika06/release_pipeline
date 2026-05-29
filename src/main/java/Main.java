public class Main {

    public static void main(String[] args) {
        String text = "Hello to the world!";
        text = truncateString(text, 5);
        System.out.println(text);
    }

    public static String truncateString(String text, int limit) {
        if (text.length() <= limit) {
            return text;
        }
        return text.substring(0, limit);
    }
}
