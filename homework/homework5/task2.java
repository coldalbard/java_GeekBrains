package java_gb.homework.homework5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class task2 {
    public static void main(String[] args) {
        String[] str = {"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин", 
        "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина",
        "Мария Рыкова", "Марина Лугова", "Анна Владимировна", "Иван Мечников", "Петр Петин", "Иван Ежов"};
        repetitionNames(str);
    }

    /**
     * @apiNote Написать программу, 
     * которая найдёт и выведет повторяющиеся имена с количеством 
     * повторений. Отсортировать по убыванию популярности.
     * @param Names Список имен и фамилий
     */
    public static void repetitionNames(String[] Names) {
        Map<String, Integer> mapCh = new HashMap<>();
        for (int i = 0; i < Names.length; i++) {
            String[] f = Names[i].split(" ");
            if (!mapCh.containsKey(f[0])) mapCh.put(f[0], 1);
            else mapCh.put(f[0], mapCh.get(f[0]) + 1);
        }

        // удаление элментов коллекции
        Iterator it=mapCh.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Character,Integer> item=(Map.Entry<Character,Integer>)it.next();
            if((Integer)item.getValue() == 1){
                it.remove();
            }
        }

        mapCh = sortByValue(mapCh);

        for (Entry<String, Integer> entity : mapCh.entrySet()) {
            System.out.println(entity.getKey() + " встретился в тексте: " + entity.getValue() + "раз(а)");
        }
    }

    /**
     * @apiNote метод для сортировки
     * @param <K> ключ
     * @param <V> значение
     * @param map коллекция
     * @return отсортированная коллекция
     */
    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        List<Entry<K, V>> list = new ArrayList<>(map.entrySet());
        list.sort(Entry.comparingByValue());

        Map<K, V> result = new LinkedHashMap<>();
        for (Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}
