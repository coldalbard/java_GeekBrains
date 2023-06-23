package java_gb.lesson.lesson6;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        Worker w1 = new Worker();
        w1.id = 1000;
        w1.salary = 100;
        w1.name = "Имя_1";
        w1.surname = "Фамилия_1";

        Worker w2 = new Worker();
        w2.id = 1000;
        w2.salary = 100;
        w2.name = "Имя_2";
        w2.surname = "Фамилия_2";

        Worker w3 = new Worker();
        w3.id = 1000;
        w3.salary = 100;
        w3.name = "Имя_3";
        w3.surname = "Фамилия_3";

        Worker w4 = new Worker();
        w4.id = 1000;
        w4.salary = 100;
        w4.name = "Имя_4";
        w4.surname = "Фамилия_4";

        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);
        System.out.println(w4);

        var workers = new HashSet<Worker>(Arrays.asList(w1, w2, w3));
        System.out.println(workers.contains(w4));

    }
}
