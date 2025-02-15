public class Task4 {
    public static void main(String[] args) {
        double sum = 0;
        double term = 0;
        double n = 2;
        double tolerance = 1e-10; // Значение, которое отвечает за точность вычисления

        do {
            term = 1 / (n * n + n - 2);
            if (term >= tolerance) { // Проверка, чтобы не складывать слишком маленькие числа
                sum += term;
            }
            n++;
        } while (term >= tolerance);

        System.out.println("Sum of the series: " + sum); // Примерный ответ 0.6111111
    }
}
