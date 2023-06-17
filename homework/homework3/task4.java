package java_gb.homework.homework3;

import java.util.ArrayList;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please enter the length of the array: ");
        int n = sc.nextInt();
        System.out.println();
        ArrayList<Integer> arr = CreateIntArray(sc, n);
        MinMaxAr(arr);
    }

    /** метод для создания Массива
     * @param in Сканнер для ввода
     * @param n Кол-во элементов
     * @return готовый массив
     */
    public static ArrayList<Integer> CreateIntArray(Scanner in, int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.printf("Please enter the item under the index %d: ", i);
            arr.add(in.nextInt());
            System.out.println();
        }
        return arr;
    }

    /**
     * @apiNote 4. Задан целочисленный список ArrayList. 
     * Найти минимальное, максимальное и среднее из этого списка.
     * @param arr массив
     */
    public static void MinMaxAr(ArrayList<Integer> arr) {
        arr.sort(null);
        Integer sumNum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sumNum += arr.get(i);
        }
        System.out.println("Min: " + arr.get(0));
        System.out.println("Max: " + arr.get(arr.size() - 1));
        System.out.println("Arithmetic mean: " + (float)sumNum / arr.size());
    }
}
