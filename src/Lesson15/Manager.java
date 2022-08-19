package Lesson15;

// добавить ему double coeff.
// разчитывать зарплату как baseSalary * coeff.
// породить его от Emploeey
public class Manager extends Employee{
    double coeff;

    public Manager(int id, String name, String company, int baseSalary, double coeff) {
        super(id, name, company, baseSalary);
        this.coeff = coeff;
    }

    @Override
    public int getSalary()
    {
        // через префикс супер можно вызовать функций определенные в базовом классе
        return(int) (super .getSalary()* coeff);
    }
}
