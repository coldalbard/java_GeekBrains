package java_gb.homework.homework3;

public class Books {
    private String bookName;
    private String autSurname;
    private Integer price;
    private Integer publYear;
    private Integer numbPages;

    public Books(String bookName, String autSurname, Integer price, Integer publYear, Integer numbPages) {
        this.bookName = bookName;
        this.autSurname = autSurname;
        this.price = price;
        this.publYear = publYear;
        this.numbPages = numbPages;
    }

    public String toString() {
        return "books{ book name : " + bookName + '\''
        + ", author surname : " + autSurname + '\'' 
        + ", price : " + price + '\''
        + ", publication year : " + publYear + '\'' 
        + ", number of pages : " + numbPages + '\'' +  '}';
    }

    public String getBookName() {
        return bookName;
    }


    public void setBookName(String bookName) {
        this.bookName = bookName;
    }


    public String getAutSurname() {
        return autSurname;
    }


    public void setAutSurname(String autSurname) {
        this.autSurname = autSurname;
    }


    public Integer getPrice() {
        return price;
    }


    public void setPrice(Integer price) {
        this.price = price;
    }


    public Integer getPublYear() {
        return publYear;
    }


    public void setPublYear(Integer publYear) {
        this.publYear = publYear;
    }


    public Integer getNumbPages() {
        return numbPages;
    }


    public void setNumbPages(Integer numbPages) {
        this.numbPages = numbPages;
    }
    
}
