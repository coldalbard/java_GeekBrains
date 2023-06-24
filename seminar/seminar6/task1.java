package java_gb.seminar.seminar6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class task1 {
    public static void main(String[] args) {
        // 1) Дан массив чисел, посчитать процент уникальных чисел.
        // *процент уникальных чисел = 
        // количество уникальных чисел * 100 / общее количество чисел в массиве.
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 1, 2));
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.size(); i++) {
            set.add(arr.get(i));
        }
        double procent = set.size() * 100 / arr.size();
        System.out.println(procent);
    }
}
