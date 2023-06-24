package java_gb.seminar.seminar6;

public class Farengheit implements Converter{

    @Override
    public double convertValue(double baseValue) {
        return baseValue * 1.8 + 32;
    }
    
}
