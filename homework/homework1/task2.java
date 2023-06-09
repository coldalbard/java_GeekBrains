import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Result = " + SumPositiveNumbers(sc));
        sc.close();
    }


    /**
     * @apiNote ана последовательность целых чисел, оканчивающаяся нулем. 
     * Найти сумму положительных чисел, после которых следует отрицательное число.
     * @param size кол-во чисел
     * @return сумма положительных чисел, после которых следует отрицательное число.
     */
    
    public static int SumPositiveNumbers(Scanner in) {
        System.out.printf("Please, enter your first number: ");
        int firstNum = in.nextInt();
        int countSumPosNumb = 0;
        while (firstNum != 0) {
            System.out.printf("Please, enter your next number: ");
            int number = in.nextInt();
            if (number < 0 && firstNum > 0) {
                countSumPosNumb += firstNum;
            }
            firstNum = number;
        }
        return countSumPosNumb;
    }
}
