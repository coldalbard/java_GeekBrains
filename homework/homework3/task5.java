package java_gb.homework.homework3;

import java.util.ArrayList;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please enter the length of the array: ");
        int n = sc.nextInt();
        System.out.println();
        ArrayList<Integer> arr = CreateIntArray(sc, n);
        permutationsArray(arr.size(), arr);
    }


    public static ArrayList<Integer> CreateIntArray(Scanner in, int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.printf("Please enter the item under the index %d: ", i);
            arr.add(in.nextInt());
            System.out.println();
        }
        return arr;
    }

    public static ArrayList<Integer> swap(ArrayList<Integer> arr, int index, int size) {
        for (int i = index; i <= index; i++) {
            Integer temp = arr.get(i);
            arr.set(i, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);
        }
        return arr;
    }
    
    public static void permutationsArray(int n, ArrayList<Integer> arr) {
        
    }
}
