package java_gb.seminar.seminar6;

public class task4 {
    public static void main(String[] args) {
        double temp = 0.0;
        System.out.println("temp Celsii = " + new Celsii().convertValue(temp));
        System.out.println("temp Kelvin = " + new Kelvin().convertValue(temp));
        System.out.println("temp Farengheit = " + new Farengheit().convertValue(temp));
    }
}
