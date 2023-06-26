package java_gb.homework.homework6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Laptops {
    private String laptopName;
    private String OperatingSystem;
    private String laptopColor;
    private Integer laptopRAM;
    private Integer hardDrive;


    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }

    public String getOperatingSystem() {
        return OperatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        OperatingSystem = operatingSystem;
    }

    public String getLaptopColor() {
        return laptopColor;
    }

    public void setLaptopColor(String laptopColor) {
        this.laptopColor = laptopColor;
    }

    public Integer getLaptopRAM() {
        return laptopRAM;
    }

    public void setLaptopRAM(Integer laptopRAM) {
        this.laptopRAM = laptopRAM;
    }

    public Integer getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(Integer hardDrive) {
        this.hardDrive = hardDrive;
    }

    public Laptops(String laptopName, String operatingSystem, String laptopColor, Integer laptopRAM, Integer hardDrive) {
        this.laptopName = laptopName;
        OperatingSystem = operatingSystem;
        this.laptopColor = laptopColor;
        this.laptopRAM = laptopRAM;
        this.hardDrive = hardDrive;
    }


    @Override
    public String toString() {
        return "\nlaptop:\nName: " + laptopName + "\nOperating System: " 
        + OperatingSystem + "\nColor: " + laptopColor + "\nRAM: " 
        + laptopRAM + "\nHard Drive: " + hardDrive + "\n";
    }

    public static List<Laptops> sortLaptopLst(List<Laptops> lp) {
        for (int i = 0; i < lp.size(); i++) {
            for (int j = i + 1; j < lp.size(); j++) {
                if (lp.get(i).getLaptopRAM() >= lp.get(j).getLaptopRAM()) {
                    Laptops temp = lp.get(i);
                    lp.set(i, lp.get(j));
                    lp.set(j, temp);
                }
            }
        }
        return lp;
    }

    public List<Laptops> laptopGeneric() {
        String[] laptopNames = {"ASUS", "HUAWEI", "HONOR", "KATANA", "Xiaomi", "Thunderrobot"};
        String[] laptopOS = {"Windows", "Linux"};
        String[] lpColor = {"Черный", "Белый", "Серый", "Желтый"};
        Integer[] lpRAM = {4, 8, 16, 32, 64};
        Integer[] lpHDrive = {250, 500, 750, 1000, 200};
        List<Laptops> lst = new ArrayList<>();
        for (int i = 0; i < Math.random() * 10; i++) {
            Laptops lp = new Laptops(laptopNames[ThreadLocalRandom.current().nextInt(0, laptopNames.length)], 
            laptopOS[ThreadLocalRandom.current().nextInt(0, laptopOS.length)], 
            lpColor[ThreadLocalRandom.current().nextInt(0, lpColor.length)],
            lpRAM[ThreadLocalRandom.current().nextInt(0, lpRAM.length)],
            lpHDrive[ThreadLocalRandom.current().nextInt(0, lpHDrive.length)]);
            lst.add(lp);
        }
        lst = sortLaptopLst(lst);
        return lst;
    }

    public List<Laptops> returnSearch(Scanner sc, List<Laptops> lp) {
        System.out.println();
        System.out.printf("Введите цифру, соответствующую необходимому критерию:\n1: Название \n2: Операционная система \n3: Цвет \n4: Оперативная память \n5: Объем жесткого диска \n6: Вывести все \nВвод: ");
        Object data = "";
        Integer searchNumber = sc.nextInt();
        if (searchNumber >= 1 && searchNumber <= 5) {
            System.out.printf("Введите данные для поиска: ");
            data = sc.next();
        }
        System.out.println();
        List<Laptops> retLst = new ArrayList<>();
        for (Laptops laptops : lp) {
            if(searchNumber >= 1 && searchNumber <= 5){
                if (searchNumber == 1 && laptops.getLaptopName().equals(data)) retLst.add(laptops);
                else if (searchNumber == 2 && laptops.getOperatingSystem().equals(data)) retLst.add(laptops);
                else if (searchNumber == 3 && laptops.getLaptopColor().equals(data)) retLst.add(laptops);
                else if (searchNumber == 4 && laptops.getLaptopRAM().equals(Integer.valueOf((String) data))) retLst.add(laptops);
                else if (searchNumber == 5 && laptops.getHardDrive().equals(Integer.valueOf((String) data))) retLst.add(laptops);
            }
            else if (searchNumber == 6) return lp;
            else {
                System.out.println("Введены некорректные данные");
                returnSearch(sc, lp);
            }
        }
        retLst = sortLaptopLst(retLst);
        return retLst;
    } 
}
