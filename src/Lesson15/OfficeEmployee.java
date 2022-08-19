package Lesson15;
//          Порожденный класс         Супер класс
//          Дочерный класс  расширяет Базовый класс
public class OfficeEmployee extends Employee{
    int monthlyBonus;

    public OfficeEmployee(int id, String name, String company, int baseSalary, int monthlyBonus) {
        // в констр. дочерного класса задьлжително надо вызвать констр.базового
        super(id, name, company, baseSalary);
        this.monthlyBonus = monthlyBonus;
    }

    // Override - заменять,переезжать,преоделевать
    // аннотация override нужна чтобы проверить что в базовым классе есть функция с таким названием
    @Override
    public int getSalary()
    {
        return baseSalary + monthlyBonus;
    }


    public int getMonthlyBonus()
    {
        return monthlyBonus;
    }

    public void introduce()
    {
        System.out.println("Name is: "+ getName() + getCompany() + "bonus" + getMonthlyBonus());
    }


}
