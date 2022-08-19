package Lesson15;

public class Employee {
    int id;
    String name;
    String company;
    int baseSalary;

    // public - видно везде
    // без модификатора - видно в package
    // protected - видно в дочерных классах и в package
    // private -  видно только в самом классе


    public int getSalary()
    {
        return baseSalary;
    }

    public Employee(int id, String name, String company, int baseSalary) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.baseSalary = baseSalary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public int getBaseSalary() {
        return baseSalary;
    }
}
