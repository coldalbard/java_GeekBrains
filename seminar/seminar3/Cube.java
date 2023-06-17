public class Cube {
    private Integer size;
    private String color;
    private String material;
    
    public Cube(Integer size, String color, String material) {
        this.size = size;
        this.color = color;
        this.material = material;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String toString() {
        return "student{ size : " + size + '\'' 
        + ", color : " + color + '\''
        + ", degrees : " + material + '\'' + '}';
    }

    public Integer yellowCube(){
        return size*size*size;
    }
}
