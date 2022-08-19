public class lesson13 {


    //Клас -    обединение чего либо по характерным признакам
    // Шаблон для описание своих представителей
    // Клас в Джава содержит описание свойств и действий
    // Представитель класса - екземпляр entity
    // Свойства класса - поле
    // Действие класса - метод либо функция
    //Инкапсуляция - размещение (организация кода) полей и методов
    // связаны друг с другом в одном классе
    //Есть возможность скрыть поля и методы от вызова из вне ,из за пределов класса или пакета
    public static void main(String[] args) {

        Human vasya = new Human(); // Создание нового екземпляра класса Human
        //Human() - конструктор/ constructor
        vasya.name = "Vasya";
        vasya.lastName = "Samokhvalov";
        vasya.age = 27;
        vasya.name = "Petya";
        vasya.introduce(/*30000*/);
    }
}

    class Human{
    String name;
    String lastName;
    int age;
    void introduce (/*int salary*/)
    {
        System.out.println("My name ist " + name + " " + lastName +". I'm "+ age +"years old. ");

    }


    }

