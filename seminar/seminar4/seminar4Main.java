package java_gb.seminar.seminar4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringJoiner;

public class seminar4Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // test(sc);
        // task2(n);
        // task3(n);
        // task4();
        // System.out.println(task5("/home//foo/"));
    }

    public static void test(Scanner sc) {
        LinkedList<Integer> integersLL = new LinkedList<>();
        int n = sc.nextInt();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            integersLL.add(random.nextInt(10));
        }
        System.out.println(integersLL);
        sc.close();
        // System.out.println(integersLL.peek());
        // System.out.println(integersLL.pop());
        // System.out.println(integersLL);
        // integersLL.addFirst(3);
        // integersLL.addLast(2);
        // System.out.println(integersLL);
        // integersLL.remove(3);
        // System.out.println(integersLL);
        integersLL.remove((Integer) 0);
        System.out.println(integersLL);
    }


    public static void task2(int n) {
        LinkedList<Integer> ll = new LinkedList<>();
        int sumCh = 0;
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            ll.add(random.nextInt(10));
        }
        for (Integer el : ll) {
            if (el % 2 == 0) {
                sumCh += el;
            }
        }
        System.out.println(ll);
        System.out.println(sumCh);
    }

    // 3. Заменить некратные 3 элементы списка, суммой нечетных элементов.
    public static void task3(int n) {
        LinkedList<Integer> ll = new LinkedList<>();
        int sumNCH = 0;
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            ll.add(random.nextInt(10));
        }
        System.out.println(ll);
        for (Integer el : ll) {
            if (el % 2 != 0) {
                sumNCH += el;
            }
        }
        System.out.println(sumNCH);
        for (int i = 0; i < ll.size(); i++) {
            if (ll.get(i) % 2 != 0) {
                
            }
        }
        System.out.println(ll);
    }

    // Удалить отрицательные элементы списка.
    public static void task4() {
        LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(1, -1, -1, 2, 3, 8, -6));
        System.out.println(ll);
        for (int i = 0; i < ll.size(); i++) {
            if (ll.get(i) < 0) {
                ll.remove(i);
                i -= 1;
            }
        }
        System.out.println(ll);
    }

    public static  String task5(String path) {
        Stack<String> stack = new Stack<>();
        StringBuilder res = new StringBuilder();
        String[] subPath = path.split("/");
        for (String string : subPath) {
            if("..".equals(string)){
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }else if(!".".equals(string) && !string.isEmpty()){
                stack.push(string);
            }
        }
        if (stack.isEmpty()) return "/";
        while (!stack.isEmpty()) {
            res.insert(0, stack.pop()).insert(0, "/");
        }
        return res.toString();
    }
}
