import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = getStringFromUser(scanner);
        String processedString = prepareString(inputString);
        boolean isPalindrome = isStringPalindrome(processedString);

        printPalindromeResult(inputString, isPalindrome);

        scanner.close();
    }

    // Функция для получения строки от пользователя
    public static String getStringFromUser(Scanner scanner) {
        System.out.println("Введите строку для проверки на палиндром:");
        return scanner.nextLine();
    }

    // Функция для Удаленич не букв и приведение к нижнему регистру
    public static String prepareString(String str) {
        return str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    // Функция для проверки, является ли строка палиндромом
    public static boolean isStringPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    public static void printPalindromeResult(String originalString, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println(originalString + " - палиндром");
        } else {
            System.out.println(originalString + " - не палиндром");
        }
    }
}
