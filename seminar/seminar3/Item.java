public class Item {
    private String name;
    private String country;
    private Integer volume;

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

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Item(String name, String country, Integer volume) {
        this.name = name;
        this.country = country;
        this.volume = volume;
    }

    public Item(){

    }

    public String toString() {
        return "item{ name : " + name + '\'' 
        + ", contry : " + country + '\''
        + ", volume : " + volume + '\''
        + '}';
    }
}
