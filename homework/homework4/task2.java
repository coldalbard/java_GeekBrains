package java_gb.homework.homework4;

import java.util.Arrays;
import java.util.LinkedList;

public class task2 {
    public static void main(String[] args) {
        String checkString = "(){}[]([])";
        // System.out.println(pairsBrackets(checkString)); // 1-е решение
        // System.out.println(pairsBracketsTwo(checkString)); // 2-е решение
    }

    /**
     * 1-е решение
     * не знаю, является ли [()]{} допустимым или нет.
     * работает только для похожего текста - ()[]{}
     * 
     * @apiNote Открытые скобки должны быть закрыты в правильном порядке.
     * @param text Входной текст
     * @return true или false
     */
    public static boolean pairsBrackets(String text) {
        String[] f = text.split("");
        String test1 = "()";
        String test2 = "[]";
        String test3 = "{}";
        for (int i = 0; i < f.length - 1; i++) {
            String checkString = f[i] + f[i + 1];
            System.out.println(checkString);
            if (checkString.equals(test1) || checkString.equals(test2) || checkString.equals(test3)) {
                i += 1;
            } else {
                return false;
            }
        }
        return true;
    }

    /**
     * @apiNote 2-е решение, скопипастил код, но благодаря дебагу разобрался как он работает
     * @param text
     * @return
     */
    private static boolean pairsBracketsTwo(String text) {
        if (text == null || text.length() == 0) {
            return true;
        }

        int ptr = 0;
        char[] map = new char[text.length()];
        for (char ch : text.toCharArray()) {
            switch (ch) {
                case '(':
                case '{':
                case '[':
                    map[ptr++] = ch;
                    break;
                case ')':
                    if (ptr == 0 || map[--ptr] != '(')
                        return false;
                    break;
                case '}':
                    if (ptr == 0 || map[--ptr] != '{')
                        return false;
                    break;
                case ']':
                    if (ptr == 0 || map[--ptr] != '[')
                        return false;
                    break;
            }
        }
        return ptr == 0;
    }
}
