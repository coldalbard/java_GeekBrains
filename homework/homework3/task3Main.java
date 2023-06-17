package java_gb.homework.homework3;

import java.util.ArrayList;
import java.util.Scanner;

public class task3Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please enter the number of books: ");
        int n = sc.nextInt();
        System.out.println();
        ArrayList<Books> books = createList(sc, n);
        System.out.println(books);
        ArrayList<String> nBooks = simpleNumPages(books);
        System.out.println(nBooks);
    }


    /** метод для создания Массива книг
     * @param in Сканнер для ввода
     * @param n Кол-во товаров
     * @return готовый массив
     */
    public static ArrayList<Books> createList(Scanner in, int n) {
        ArrayList<Books> resultList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            in.nextLine();
            System.out.printf("Please enter your book name: ");
            String bookName = in.nextLine();
            System.out.printf("Please enter your author surname: ");
            String surname = in.nextLine();
            System.out.printf("Please enter your book price: ");
            Integer price = in.nextInt();
            System.out.printf("Please enter the publication date of your book: ");
            Integer publYear = in.nextInt();
            System.out.printf("Please enter the number of pages: ");
            Integer numPages = in.nextInt();
            Books book = new Books(bookName, surname, price, publYear, numPages);
            resultList.add(book);
        }
        return resultList;
    }


    /** @apiNote 3. Сведения о книге состоят из названия, 
     * фамилии автора, цены, года издания и количества страниц. 
     * Найти названия книг, в которых простое количество страниц, 
     * фамилия автора содержит «А» и год издания после 2010 г, включительно.
     * @param books массив из книг
     * @return Названия книг
     */
    private static ArrayList<String> simpleNumPages(ArrayList<Books> books) { // O(N * sqrt(N)) оптимизировал немного)
        ArrayList<String> bookNames = new ArrayList<>();
        for (Books book : books) { // O(N) 
            if (book.getAutSurname().toLowerCase().contains("а") 
            && book.getPublYear() >= 2010) { // "a" - русская
                boolean simple = true;
                for (int i = 2; i * i <= book.getNumbPages(); i++) { // O(sqrt(N))
                    if(book.getNumbPages() % i == 0){
                        simple = false;
                        break;
                    }
                }
                if(simple) {
                    bookNames.add(book.getBookName());
                }
            }
        }
        return bookNames;
    }
}
