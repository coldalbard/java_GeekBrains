package java_gb.seminar.seminar6;

import java.util.Arrays;
import java.util.HashSet;

public class task2 {
    public static void main(String[] args) {
        // 2) Найти пересечение двух множеств
        // Пример:
        // set1= [1,2,3,4]
        // set2= [3,5,6,7]
        // Вывод в консоль:
        // [3]
        HashSet<Integer> numb1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        HashSet<Integer> numb2 = new HashSet<>(Arrays.asList(3, 5, 6, 7));
        HashSet<Integer> pNumbers = new HashSet<>(numb1);
        pNumbers.retainAll(numb2);
        System.out.println(numb1);
        System.out.println(numb2);
        System.out.println(pNumbers);
    }
}
