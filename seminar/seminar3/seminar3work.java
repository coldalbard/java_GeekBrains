import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class seminar3work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // task1
        // int n = sc.nextInt();
        // List<Item> itemList = createList(n);
        // List<String> countryList = new ArrayList<>();
        // System.out.println(itemList);
        // String searchName = sc.next();
        // Integer sumValue = 0;
        // task1(sumValue, countryList, itemList, searchName);

        // task2
        // int n = sc.nextInt();
        // List<student> studentsList = createListTask2(sc, n);
        // System.out.println(studentsList);
        // task2(studentsList);

        // task 3
        // int n = sc.nextInt();
        // List<Cube> cubeList = createListTask3(sc, n);
        // task3(cubeList);

        // task4
        // int n = sc.nextInt();
        // List<Cube> cubeList = createListTask3(sc, n);
        // System.out.println(unicCollection(cubeList));
    }

    /**
     * @apiNote формирование ArrayList<Item> для первого задания
     * @param n
     * @return resultList
     */
    public static ArrayList<Item> createList(int n) {
        ArrayList<Item> resultList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            Item item1 = new Item("qwerty", "safsa1", random.nextInt(100));
            Item item2 = new Item("qwerty", "safsa2", random.nextInt(100));
            Item item3 = new Item("qwerty", "safsa3", random.nextInt(100));
            Item item4 = new Item("qwerty", "safsa4", random.nextInt(100));
            resultList.add(item1);
            resultList.add(item2);
            resultList.add(item3);
            resultList.add(item4);
        }
        return resultList;
    }




    /** // task1
     * @apiNote Найти страны, ко торые экспортируют данный(введенный с кл-ы) товар,
     *          и общий объем его экспорта.
     * @param sumValue
     * @param countryList
     * @param itemList
     * @param searchName
     */
    public static void task1(Integer sumValue, List<String> countryList, List<Item> itemList, String searchName) {
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).getName().equals(searchName)) {
                sumValue += itemList.get(i).getVolume();
                countryList.add(itemList.get(i).getCountry());
            }
        }
        System.out.println("Country list = " + countryList);
        System.out.println("Sum Value = " + sumValue);
    }




    /** task2
     * 
     * @param stList
     */
    public static void task2(List<student> stList) {
        for (student st : stList) {
            if (st.getSurname().endsWith("ова") && st.getPoints() % 2 == 0) {
                System.out.println(st.getSurname());
            }
        }
    }

    /**
     * 
     * @param in
     * @param n
     * @return
     */
    public static ArrayList<student> createListTask2(Scanner in, int n) {
        ArrayList<student> resultList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.printf("Please enter your surname: ");
            in.nextLine();
            String surname = in.nextLine();
            System.out.printf("Please enter your group: ");
            Integer group = in.nextInt();
            System.out.printf("Please enter your degree: ");
            Integer degrees = in.nextInt();
            System.out.printf("Please enter your points: ");
            Integer points = in.nextInt();
            student students = new student(surname, group, degrees, points);
            resultList.add(students);
        }
        return resultList;
    }




    /** task  3
     * @apiNote // - количество кубиков желтого цвета и их суммарный объем;
     *          // - количество деревянных кубиков с ребром 3 с
     * @param cList ArrayList<Cube>
     */
    private static void task3(List<Cube> cList) {
        Integer yellowCubeSum = 0;
        Integer yellowCube = 0;
        Integer woodenCube = 0;
        System.out.println(cList);
        for (Cube cube : cList) {
            if (cube.getColor().equals("yellow")) {
                yellowCube += 1;
                yellowCubeSum += cube.yellowCube();
            }
            if (cube.getMaterial().equals("wooden") && cube.getSize() == 3) {
                woodenCube += 1;
            }
        }
        System.out.printf("%d кол-во кубиков желтого цвета, %d их суммарный объем", yellowCube, yellowCubeSum);
        System.out.println();
        System.out.printf("%d кол-во деревянных кубиков с ребром 3", woodenCube);
    }

    /**
     * @param in
     * @param n
     * @return
     */
    public static ArrayList<Cube> createListTask3(Scanner in, int n) {
        ArrayList<Cube> resultList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.printf("Please enter your size: ");
            Integer size = in.nextInt();
            System.out.printf("Please enter your color: ");
            in.nextLine();
            String color = in.nextLine();
            System.out.printf("Please enter your material: ");
            String material = in.nextLine();
            Cube cubes = new Cube(size, color, material);
            resultList.add(cubes);
        }
        return resultList;
    }



    // task4
    public static Collection unicCollection(List<Cube> lst) {
        return new HashSet<>(lst);
    }
}
