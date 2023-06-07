package java_gb.seminar;

import java.util.Scanner;

public class seminar1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // first task
        // System.out.printf("Plaese, enter your number: ");
        // int n = sc.nextInt();
        // System.out.println("Result = " + MultiplicationSum(n));

        // second task
        // System.out.printf("Please enter the number of numbers: ");
        // int n = sc.nextInt();
        // System.out.println("Result = " + CountChange(n));

        // third task
        // System.out.printf("Please enter your text: ");
        // String text = sc.nextLine();
        // System.out.println("Result = " + SwapPlaces(text));
    }


    /**
     * @apiNote Заданное целое число возращает разность между его произведением его цифр на сумму его цифр
     * @param number входящее целое число
     * @return результат вычисления задачи
     */

    public static int MultiplicationSum(int number) {
        int multi = 1, nSum = 0;
        while (number > 0) {
            int digit = number % 10;
            multi *= digit;
            nSum += digit;
            number /= 10;
        }
        return multi - nSum;
    }

    
    /**
     * @apiNote Дана последовательность N целых чисел. Найти количество положительных чисел, после которых следует отрицательное число.
     * @param number входящее целое число(кол-во чисел которые у нас будут)
     * @return кол-во смены знаков
     */

    public static int CountChange(int number) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        System.out.printf("Please enter your first number: ");
        int sNum = sc.nextInt();
        for(int i = 0; i < number - 1; i++){
            System.out.printf("Plaese, enter your next number: ");
            int num = sc.nextInt();
            if(sNum >= 0 && num < 0){
                counter += 1;
            }
            sNum = num;
        }
        return counter;
    }


    /**
     * @apiNote Дана строка. Поменять местами ее половины.
     * @param text строка с текстом
     * @return строка где сначала идет вторая половина от изначального текста, а затем первая половина
     */

    public static String SwapPlaces(String text) {
        String firsHalf = text.substring(0, text.length() / 2);
        String secondHalf = text.substring( text.length() / 2);
        return secondHalf + firsHalf;
    }
}