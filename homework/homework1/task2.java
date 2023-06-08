import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please enter the number of numbers: ");
        int size = sc.nextInt();
        System.out.println(SumPositiveNumbers(size - 1));
    }


    /**
     * @apiNote ана последовательность целых чисел, оканчивающаяся нулем. 
     * Найти сумму положительных чисел, после которых следует отрицательное число.
     * @param size кол-во чисел
     * @return сумма положительных чисел, после которых следует отрицательное число.
     */
    
    public static int SumPositiveNumbers(int size) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please, enter your first number: ");
        int first_num = sc.nextInt();
        int countSumPosNumb = 0;
        while (size != 0) {
            System.out.printf("Please, enter your next number: ");
            int number = sc.nextInt();
            size -= 1;
            if (number < 0 && first_num > 0) {
                countSumPosNumb += first_num;
            }
            first_num = number;
        }
        return countSumPosNumb;
    }
}
