public class lastTask {
    public static void main(String[] args) {
        Vector vector = new Vector(1,2,3);
        System.out.println("vector.vectorLength() = " + vector.vectorLength());
        Vector vector2 = new Vector(1,1,1);
        System.out.println("vector.scalar(vector2) = " + vector.scalar(vector2));
        System.out.println("vector.vectorMulti(vector2) = " + vector.vectorMulti(vector2));
        System.out.println(vector);

    }
}
