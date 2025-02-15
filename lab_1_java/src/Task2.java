public class Task2 {
    public static void main(String[] args) {
        String str = "make install";
        String reversedStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }

        System.out.println(reversedStr);
    }
}
