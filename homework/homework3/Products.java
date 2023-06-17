package java_gb.homework.homework3;

public class Products {
    private String product;
    private Integer price;
    private Integer variety;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
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

    public Products(String product, Integer price, Integer variety) {
        this.product = product;
        this.price = price;
        this.variety = variety;
    }

    public String toString() {
        return "product{ product name : " + product + '\'' 
        + ", price : " + price + '\''
        + ", variety : " + variety + '\'' + '}';
    }
}
