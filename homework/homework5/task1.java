package java_gb.homework.homework5;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class task1 {
    public static void main(String[] args) {
        String str = "Россия идет вперед всей планеты. Планета — это не Россия.".toLowerCase();
        String searchStr = "Россия";
        searchWord(searchStr.toLowerCase(), str);
    }


    /**
     * @apiNote 1) Подсчитать количество искомого слова, через map 
     * (наполнением значение, где искомое слово будет являться ключом), вносить все слова не нужно
     * Пример: Россия идет вперед всей планеты. Планета — это не Россия.
     * Запрос: Россия
     * Ответ: Россия - 2
     * toLoverCase().
     * (Усложнение - игнорировать пунктуацию)
     * @param search искомое слово
     * @param text сам текст
     */
    public static void searchWord(String search, String text) {
        Map<String, Integer> mapCh = new HashMap<>();
        String[] textArr = text.split(" ");
        for (int i = 0; i < textArr.length; i++) {
            if (textArr[i].contains(search)) {
                if (textArr[i].length() == search.length()) {
                    if (!mapCh.containsKey(textArr[i])) mapCh.put(textArr[i], 1);
                    else mapCh.put(textArr[i], mapCh.get(textArr[i]) + 1);
                } else {
                    if (!mapCh.containsKey(search)) mapCh.put(search, 1);
                    else mapCh.put(search, mapCh.get(search) + 1);
                }
            }   
        }
        for (Entry<String, Integer> entity : mapCh.entrySet()) {
            System.out.println(entity.getKey() + " встретился в тексте: " + entity.getValue() + "раз(а)");
        }
    }
}

