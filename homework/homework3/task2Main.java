package java_gb.homework.homework3;

import java.util.ArrayList;
import java.util.Scanner;

public class task2Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please enter the number of products: ");
        int n = sc.nextInt();
        System.out.println();
        ArrayList<ProductsTask2> products = createList(sc, n);
        System.out.println(products);
        Integer mPrice = searchMinPrice(sc, products);
        for (int i = 0; i < products.size(); i++) {
            if(mPrice == products.get(i).getPrice()){
                // вывод наименования продукта с наименьшей ценой
                System.out.println(products.get(i).getName());
                break;
            }
        }
    }

    /** метод для создания Массива продуктов
     * @param in Сканнер для ввода
     * @param n Кол-во товаров
     * @return готовый массив
     */
    public static ArrayList<ProductsTask2> createList(Scanner in, int n) {
        ArrayList<ProductsTask2> resultList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            in.nextLine();
            System.out.printf("Please enter your product name: ");
            String name = in.nextLine();
            System.out.printf("Please enter your product country: ");
            String country = in.nextLine();
            System.out.printf("Please enter your product price: ");
            Integer price = in.nextInt();
            System.out.printf("Please enter your product grade: ");
            Integer variety = in.nextInt();
            ProductsTask2 products = new ProductsTask2(name, country, price, variety);
            resultList.add(products);
        }
        return resultList;
    }


    /**
     * @apiNote 2. Сведения о товаре состоят из наименования, 
     * страны-производителя, веса, цены, сорта. 
     * Получить наименования товаров заданного сорта с наименьшей ценой.
     * @param in Сканнер для ввода
     * @param pr массив из продуктов
     * @return продукт с минимальной ценой
     */
    public static Integer searchMinPrice(Scanner in, ArrayList<ProductsTask2> pr) {
        System.out.printf("Please, specify the grade: ");
        Integer searchVariety = in.nextInt();
        Integer minPrice = pr.get(0).getPrice();
        for (ProductsTask2 prod : pr) {
            if (prod.getVariety() == searchVariety && prod.getPrice() > minPrice) {
                continue;
            }
            else {
                minPrice = prod.getPrice();
            }
        }
        return minPrice;
    }

}
