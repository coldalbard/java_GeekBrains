package java_gb.homework.homework4;

import java.util.Arrays;
import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(1, -1, -1, 2, 3, 8, -6));
        System.out.println(numbers);
        // System.out.println(reverseLL(numbers)); // 1-е решение(разварачивает исходный массив)
        // System.out.println(secondSolReverseLL(numbers)); // 2-е решение(не разваричивает исходный массив)
    }

    /** 1-е решение
     * @apiNote // 1)Вывести список на экран в перевернутом виде 
    // (без массивов и ArrayList)
    // Пример: 1 -> 2->3->4
    // Вывод: 4->3->2->1
     * @param arr Входной ll
     * @return Развернутый ll
     */
    public static LinkedList<Integer> reverseLL(LinkedList<Integer> arr) {
        if (arr.size() <= 1) return arr;
        for (int i = 0; i < arr.size() / 2; i++) {
            int temp = arr.get(i);
            arr.set(i, arr.get(arr.size() - i - 1));
            arr.set(arr.size() - i - 1, temp);
        }
        return arr;
    }


    /**
     * @apiNote 2-е решение
     * @param arr Входной ll
     * @return Развернутый ll
     */
    public static LinkedList<Integer> secondSolReverseLL(LinkedList<Integer> arr) {
        LinkedList<Integer> numb = new LinkedList<>();
        if (arr.size() <= 1) return arr;
        while (arr.size() > 0) {
            numb.add(arr.pollLast());
        }
        return numb;
    }
}
