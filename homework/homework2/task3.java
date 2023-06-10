package java_gb.homework.homework2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please enter the length of the array: ");
        int size = sc.nextInt();
        int[] myArray = createArray(sc, size);
        System.out.println("Initial array: ");
        ShowArray(myArray);
        int[] resArr = replacementNegative(myArray);
        System.out.println("array after replacement: ");
        ShowArray(resArr);
    }


    /**
     * @apiNote Метод для слздания массива
     * (элементы вводит пользоваетль)
     * @param in Сканнер
     * @param sizeArr для массива
     * @return arr - созданный массив
     */
    public static int[] createArray(Scanner in, int sizeArr) {
        int[] arr = new int [sizeArr];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Please enter %d item: ", i + 1);
            arr[i] = in.nextInt();
        }
        System.out.println();
        return arr;
    }

    
    /**
     * @apiNote Метод для вывода массива на экран
     * @param array Массив
     */
    public static void ShowArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(i != array.length - 1) System.out.printf("%d, ", array[i]);
            else System.out.printf("%d", array[i]);
        }
        System.out.println();
    }


    /**
     * @apiNote 3) Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
     * @param arr массив пользователя
     * @return arr - массив с заменами
     */
    public static int[] replacementNegative(int[] arr) {
        int sumPositiveIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 10) sumPositiveIndex += i;
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] < 0 && sumPositiveIndex > 0) arr[j] = sumPositiveIndex;
        }
        return arr;
    }

}
