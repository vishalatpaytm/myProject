public class Main {
    public static void main(String[] args) {
        String message1 = "Hello World";
        String message2 = new String("Good Morning Vishal!");
        int len = message1.length();
        System.out.println(len);
        System.out.println(message1 + ". " + message2);
        System.out.println(message2.indexOf("l!"));
        System.out.println(message2.endsWith("al"));
        System.out.println(message2.startsWith("Goo"));
    }
}
