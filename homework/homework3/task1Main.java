package java_gb.homework.homework3;

import java.util.ArrayList;
import java.util.Scanner;

public class task1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please enter the number of products: ");
        int n = sc.nextInt();
        System.out.println();
        ArrayList<Products> products = createList(sc, n);
        System.out.println(products);
        searchMaxPrice(products);
    }

    /** метод для создания Массива продуктов
     * @param in Сканнер для ввода
     * @param n Кол-во товаров
     * @return готовый массив
     */
    public static ArrayList<Products> createList(Scanner in, int n) {
        ArrayList<Products> resultList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            in.nextLine();
            System.out.printf("Please enter your product name: ");
            String product = in.nextLine();
            System.out.printf("Please enter your product price: ");
            Integer price = in.nextInt();
            System.out.printf("Please enter your product grade: ");
            Integer variety = in.nextInt();
            Products products = new Products(product, price, variety);
            resultList.add(products);
        }
        return resultList;
    }


    /**
     * @apiNote Найти наибольшую цену товаров 1го или 2го сорта, 
     * название которых содержит высший
     * @param pr массив продуктов
     */
    public static void searchMaxPrice(ArrayList<Products> pr) {
        Integer maxPrice = 0;
        for (Products products : pr) {
            if ((products.getVariety() == 1 || products.getVariety() == 2) && products.getProduct().equals("высший") && products.getPrice() > maxPrice) {
                maxPrice = products.getPrice();
            }
        }
        System.out.println(maxPrice);
    }
}
