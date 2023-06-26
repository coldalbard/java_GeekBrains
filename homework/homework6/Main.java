package java_gb.homework.homework6;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Laptops laptop = new Laptops(null, null, null, null, null);
        List<Laptops> lst = laptop.laptopGeneric();
        List<Laptops> lst2 = laptop.returnSearch(sc, lst);
        System.out.println(lst2);
    }
}
