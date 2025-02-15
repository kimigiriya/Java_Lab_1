import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, c;
        int choice = getUserChoice(scanner);

        if (choice == 1) {
            a = getCoefficientsFromUser(scanner, "a");
            b = getCoefficientsFromUser(scanner, "b");
            c = getCoefficientsFromUser(scanner, "c");
        } else if (choice == 2) {
            double[] coefficients = generateRandomCoefficients();
            a = coefficients[0];
            b = coefficients[1];
            c = coefficients[2];
            System.out.println("Сгенерированы случайные коэффициенты.");
        } else {
            System.out.println("Некорректный выбор. Используются значения по умолчанию.");
            a = 1;
            b = -5;
            c = 6;
        }

        printEquation(a, b, c);
        solveAndPrintRoots(a, b, c);

        scanner.close();
    }

    public static int getUserChoice(Scanner scanner) { // Функция для получения выбора пользователя
        System.out.println("Выберите способ ввода коэффициентов:");
        System.out.println("1 - Ввести вручную");
        System.out.println("2 - Сгенерировать случайные числа");
        return scanner.nextInt();
    }

    // Функция для получения коэффициента от пользователя
    public static double getCoefficientsFromUser(Scanner scanner, String coefficientName) {
        System.out.println("Введите коэффициент " + coefficientName + ":");
        return scanner.nextDouble();
    }

    // Функция для генерации случайных коэффициентов
    public static double[] generateRandomCoefficients() {
        Random random = new Random();
        // Генерация случайных чисел от -10 до 10
        double a = random.nextDouble() * 20 - 10;
        double b = random.nextDouble() * 20 - 10;
        double c = random.nextDouble() * 20 - 10;
        return new double[]{a, b, c};
    }

    // Функция для вывода квадратного уравнения
    public static void printEquation(double a, double b, double c) {
        System.out.println("Уравнение: " + a + "x^2 + " + b + "x + " + c + " = 0");
    }

    // Функция для решения квадратного уравнения и вывода корней
    public static void solveAndPrintRoots(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Корень 1: " + root1);
            System.out.println("Корень 2: " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Корень: " + root);
        } else {
            System.out.println("Нет вещественных корней");
        }
    }
}
