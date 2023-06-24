package java_gb.seminar.seminar6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class task3 {
    public static void main(String[] args) {
        // 3) Найти пересечения слов в массивах и указать их общее количество.
        // Пример:
        // Mas1= [“qwe”,”asd”,”qwe”,”x”]
        // Mas2=[“qwe”,”v”]
        // Результат:
        // qwe=3
        List<String> str1 = new ArrayList<>(Arrays.asList("qwe", "asd", "qwe", "x"));
        List<String> str2 = new ArrayList<>(Arrays.asList("qwe", "v", "x"));
        Set<String> setStr = new HashSet<>(str1);
        setStr.retainAll(str2);
        System.out.println(setStr);
        int k = 0;
        // решение 1
        for (String string : setStr) {
            for (int i = 0; i < str1.size(); i++) {
                if (str1.get(i).equals(string)) {
                    k++;
                }
            }
            for (int i = 0; i < str2.size(); i++) {
                if (str2.get(i).equals(string)) {
                    k++;
                }
            }
            System.out.println(string + " = " + k);
            k = 0;
        }

        // 2 решение
        Map<String, Integer> map = new HashMap<>();
        for (String s : str1) {
            map.putIfAbsent(s, 0);
            map.put(s, map.get(s) + 1);
        }

        for (String s : str2) {
            map.putIfAbsent(s, 0);
            map.put(s, map.get(s) + 1);
        }

        for (String string : setStr) {
            System.out.println(string + " = " + map.get(string));
        }
    }
}
