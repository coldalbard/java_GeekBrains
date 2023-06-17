package java_gb.homework.homework3;

public class ProductsTask2 {
    private String name;
    private String country;
    private Integer price;
    private Integer variety;

    public ProductsTask2(String name, String country, Integer price, Integer variety) {
        this.name = name;
        this.country = country;
        this.price = price;
        this.variety = variety;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public Integer getVariety() {
        return variety;
    }
    public void setVariety(Integer variety) {
        this.variety = variety;
    }

    public String toString() {
        return "product{ product name : " + name + '\'' 
        + ", country : " + country + '\''
        + ", price : " + price + '\''
        + ", variety : " + variety + '\'' + '}';
    }
}
