import Lesson15.*;

public class lesson15 {
    public static void main(String[] args) {
        //Наследования классов - способность одного класса
        // использовать и разширять   (extend) функциональность другого класса

        int [] array = {10,8,23};
        array [1] = 88;
        System.out.println(array[2]);
        System.out.println(array.length);

        AdvancedIntArray advancedArray = new AdvancedIntArray(3);
        advancedArray.set(0,10);
        advancedArray.set(1,8);
        advancedArray.set(2,23);

        advancedArray.set(1,88);
        System.out.println(advancedArray.get(2));
        System.out.println(advancedArray.size());

        Employee misha = new Employee(0,"Misha S","ibm",2200);
        OfficeEmployee dina = new OfficeEmployee(1,"Dina D. "," oracle ",2500,100);

        System.out.println(dina.getName());
        System.out.println("Misha salary:" +misha.getSalary());
        System.out.println("Dina salary:" + dina.getSalary());

        Manager gennady = new Manager(3,"Gennady M", "deutsche telecom",4500 ,1.5);
        System.out.println("Gennady's salary " + gennady.getSalary());

        HourlyEmployee veronica = new HourlyEmployee(5,"Veronica M","Siemens",2500,200);
        System.out.println("Veronica's salary:" + veronica.getBaseSalary());

        // полиморфизм - возможность вызвать метод по ссьлке на базовый класс

        ((OfficeEmployee)dina).introduce();


    }
}
