public class lesson5HomeWork {
    public static void main(String[] args) {

        System.out.println("Is divided by 3 and is >0 " + numberDividedBy3(18));

        System.out.println("Is Between 150 and 180 and is even :  " + numberBetween150And180AndIsEven(100));
        System.out.println("Is Between 150 and 180 and is even :  " + numberBetween150And180AndIsEven(160));

        System.out.println("Today is " + getWeekDay(1));
        System.out.println("Today is " + getWeekDay(3));
        System.out.println("Today is " + getWeekDay(6));
        System.out.println("Today is " + getWeekDay(9));
    }


    //  Функция которая возвращает true если число положительное и делится на 3 без остатка

    public static boolean numberDividedBy3(int number)
    {
        return number % 3 == 0 & number > 0;
    }

    // Напишите функцию которая возвращает true если число находится в диапазоне от 150 до 180 и при этом четное

    public static boolean numberBetween150And180AndIsEven(int evenNumber)
    {
        return evenNumber % 2 == 0 & evenNumber >=150 & evenNumber <= 180;

    }

    // Напишите функцию которая принимает на вход номер дня недели (1-7) и возвращает
    // строку с названием дня недели (пример: 7 -> "Воскресенье")


       public static String getWeekDay(int day)
       {
           String result = "Неизвестный день";
           if(day == 1)
           {
               result ="Monday";
           }
           else if(day==2)
           {
               result ="Tuesday";
           }
           else if(day==3)
           {
               result ="Wedensday";
           }
           else if (day==4)
           {
               result ="Thursday";
           }
              else if(day==5)
           {
               result= "Friday";
           }
              else if(day==6)
           {
               result ="Saturday";
           }
              else if(day==7)
       {
           result ="Sunday";
       }
           return result;

       }




























}








