import static java.lang.Math.sqrt;

public class Vector {
    public double x;
    public double y;
    public double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector() {
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x = " + x +
                ", y = " + y +
                ", z = " + z +
                '}';
    }

    /**
     * @return длинну вектора
     */
    public double vectorLength() {
        return sqrt(x * x + y * y + z * z);
    }

    /**
     * @return скалярное произведение
     */
    public double scalar(Vector vector2) {
        return x * vector2.x + y * vector2.y + z * vector2.z;
    }

    /**
     * @return векторное произведение
     */
    public Vector vectorMulti(Vector vector2) {
        return new Vector(
                y * vector2.z - z * vector2.y,
                z * vector2.x - x * vector2.z,
                x * vector2.y - y * vector2.x);
    }

    // метод, вычисляющий угол между векторами (или косинус угла):
    // косинус угла между векторами равен скалярному произведению векторов,
    // деленному на произведение модулей (длин) векторов:
    public double kosVector(Vector vector2) {
        return scalar(vector2) / (vectorLength() * vector2.vectorLength());
    }
}
