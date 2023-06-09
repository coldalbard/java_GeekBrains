import java.util.Scanner;

public class seminar2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // System.out.println(sumNumbers(n, sc));
        // int[] arrNum = {4, 2, 5, 8, 4, 9, 3, 4, 2};
        // System.out.println(countElem(arrNum));
    }


    /**
     * @apiNote 2)Дана последовательность из N целых чисел. Найти сумму чисел, оканчивающихся на 5, перед которыми идет четное число.
     * @param number кол-во чисел
     * @param in сканнер
     * @return smNum резельтат вычислений
     */

    public static int sumNumbers(int number, Scanner in) {
        int smNum = 0;
        int firstNum = in.nextInt();
        for (int i = 0; i < number - 1; i++) {
            int num = in.nextInt();
            if(firstNum % 2 == 0 && num % 10 == 5){
                smNum += num;
            }
            firstNum = num;
        }
        return smNum;
    }

    /**
     * @apiNote 3)Дан массив целых чисел. Найти количество пар соседних элементов, где первый элемент вдвое больше второго.
     * @param arr массив целых чисел
     * @return countN результат вычисления
     */
     
    public static int countElem(int[] arr) {
        int countN = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i - 1] == 2 * arr[i]){
                countN += 1;
            }
        }
        return countN;
    }
}