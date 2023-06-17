public class student {
    private String surname;
    private Integer group;
    private Integer degrees;
    private Integer points;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getGroup() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }

    public Integer getSalary() {
        return degrees;
    }

    public void setSalary(Integer degrees) {
        this.degrees = degrees;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public student(String surname, Integer group, Integer degrees, Integer points) {
        this.surname = surname;
        this.group = group;
        this.degrees = degrees;
        this.points = points;
    }

    public String toString() {
        return "student{ surname : " + surname + '\'' 
        + ", group : " + group + '\''
        + ", degrees : " + degrees + '\''
        + ", volume : " + points + '\''
        + '}';
    }
    
}
