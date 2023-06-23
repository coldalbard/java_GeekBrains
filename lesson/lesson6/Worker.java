package java_gb.lesson.lesson6;

public class Worker {
    int id;
    int salary;
    String name;
    String surname;

    @Override
    public String toString() {
        return String.format("id: %d, name: %s, surname: %s, salary: %d", id, name, surname,salary);
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        Worker t = (Worker) obj;
        return id == t.id && t.name == name;
    }
}
