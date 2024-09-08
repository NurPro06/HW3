public class HW3 {
    public static void main(String[] args) {
        double[] numbers = {8.0, 2.5, -3.0, 4.2, -1.5, 6.7, 3.8, -2.9, 5.6, -7.2, 2.1, -4.6, 3.3, -8.0, 1.9};

        double sum = 0;
        int count = 0;
        boolean foundFirstNegative = false;

        for (double number : numbers) {
            if (foundFirstNegative) {
                if (number > 0) {
                    sum += number;
                    count++;
                }
            } else if (number < 0) {
                foundFirstNegative = true;
            }
        }

        double average = (count > 0) ? sum / count : 0;

        System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);
    }
}

