package java_gb.homework.homework2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please, enter N number: ");
        int n = sc.nextInt();
        System.out.println(increasingSequence(sc, n));
    }


    /**
     * @apiNote Дана последовательность из N целых чисел. 
     * Верно ли, что последовательность является возрастающей.
     * @param in Сканнер для ввода
     * @param number кол-во чисел
     * @return true в случае если посл-ть возрастающая, false в противном случае
     */

    public static boolean increasingSequence(Scanner in, int number) {
        System.out.printf("Please, enter your first number: ");
        int firstNum = in.nextInt();
        for (int i = 1; i < number; i++) {
            System.out.printf("Please, enter your second number: ");
            int num = in.nextInt();
            if(firstNum > num) return false;
            firstNum = num;
        }
        return true;
    }
}
