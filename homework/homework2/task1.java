package java_gb.homework.homework2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please, enter N number: ");
        int n = sc.nextInt();
        // System.out.println(primeNumbers(n));
        System.out.println(numbers(sc, n));
    }


    /** решение если последовательность задается циклом
     * @apiNote 1) Дана последовательность N целых чисел. 
     * Найти сумму простых чисел.
     * @param numbrer Кол-во чисел в последовательности
     * @return sumPrimeNum - сумма простых чисел
     */
    public static int primeNumbers(int number) {
        int sumPrimeNum = 0;
        for (int i = 2; i <= number; i++) {
            int countN = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    countN += 1;
                }
            }
            if (countN == 2) {
                sumPrimeNum += i;
            }
        }
        return sumPrimeNum;
    }

    
    /** решение если вводит пользователь
     * @apiNote 1) Дана последовательность N целых чисел. 
     * Найти сумму простых чисел.
     * @param in Сканнер для ввода
     * @param n Кол-во чисел в последовательности
     * @return sumPositiveN - сумма простых чисел
     */
    public static int numbers(Scanner in, int n) {
        int sumPositiveN = 0;
        int countPrime = 0;
        for (int i = 0; i < n; i++) {
            System.out.printf("Please enter %d number: ", i + 1);
            int num = in.nextInt();
            countPrime = 0;
            for (int j = 1; j <= num; j++) {
                if (num % j == 0) countPrime += 1;
            }
            if (countPrime == 2) {
                sumPositiveN += num;
            }
        }
        return sumPositiveN;
    }
}
