package Lesson15;

public class HourlyEmployee extends Employee{
    int monthlyHours;

    private Manager manager;

    public int getMonthlyHours() {
        return monthlyHours;
    }

    public Manager getManager() {
        return manager;
    }

    public HourlyEmployee(int id, String name, String company, int baseSalary, int monthlyHours) {
        super(id, name, company, baseSalary);
        this.monthlyHours = monthlyHours;
    }

    @Override
    public int getBaseSalary() {
        return super.baseSalary/180*monthlyHours;
    }
}
