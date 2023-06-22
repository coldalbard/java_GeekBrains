package java_gb.seminar.seminar5;

import java.util.HashMap;
import java.util.Map;

public class seminar5 {
    public static void main(String[] args) {
        // task1();

        // int[] arr = {5, 8, 9, 6, 2};
        // task2(arr);

        String text = "MCMXCIV";
        System.out.println(task3(text));
    }


    /**
     * @apiNote 1) Посчитать количество вхождений каждого символа в текст.
     */
    public static void task1() {
        Map<Character, Integer> mapCh = new HashMap<>();
        String str = "qwery swayug ilfsvadagc lp[adsa qqqq]";
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (!mapCh.containsKey(currentChar))
                mapCh.put(currentChar, 1);
            else
                mapCh.put(currentChar, mapCh.get(currentChar) + 1);
        }
        for (Map.Entry<Character, Integer> entity : mapCh.entrySet()) {
            System.out.println(entity.getKey() + " встретился в тексте: " + entity.getValue() + "раз(а)");
        }
    }


    /**
     * @apiNote 2) Определить, есть ли в массиве дубликаты,
     *          если найден хоть один, вывести на экран (true),
     *          В противном случае (false).
     * @param arr целочисленный массив
     * @return flag True or False
     */
    public static boolean task2(int[] arr) {
        Map<Integer, Integer> mapCh = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!mapCh.containsKey(arr[i]))
                mapCh.put(arr[i], 1);
            else {
                mapCh.put(arr[i], mapCh.get(arr[i] + 1));
                return true;
            }
        }
        return false;
    }


    /**
     * @apiNote 3) Написать перевод их Римских цифр в арабские:
     * ввод: s = "LVIII"
     * вывод: 58
     * @param str входной текст
     * @return value 
     */
    public static Integer task3(String str) {
        Map<Character, Integer> mapInt= new HashMap<>();
        mapInt.put('I', 1);
        mapInt.put('V', 5);
        mapInt.put('X', 10);
        mapInt.put('L', 50);
        mapInt.put('C', 100);
        mapInt.put('D', 500);
        mapInt.put('M', 1000);
        Integer res = mapInt.get(str.charAt(str.length() - 1));
        for (int i = 0; i < str.length() - 1; i++) {
            if(mapInt.get(str.charAt(i)) < mapInt.get(str.charAt(i + 1))){
                res -= mapInt.get(str.charAt(i));
            }
            else res += mapInt.get(str.charAt(i));
        }
        return res;
    }
}
