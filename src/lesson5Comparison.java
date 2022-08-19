public class lesson5Comparison {
    public static void main(String[] args) {
         // опероторы сравнения - comparison operators
        // <   <=    >    >=    !=    ==
        // true / false

        int i= 2;
        System.out.println("i==2"+(i==2));
        System.out.println("i=2  " + (i=2));


        System.out.println(isDividedBy7(49));
        System.out.println(isDividedBy7(51));

        System.out.println(64%3);

        // Условный оператор if - else if  else

        int balance = -4;
        if(balance > 0)
        {
            System.out.println("balance " + balance + " is positive");
        }else {
            System.out.println("balance " + balance + " is not positive");
        }
        /*
        if(условие1)
        {
        выполняеться только если условие= true
        }
        else if
        {
        выполняется если условие1= false и условие2 = true
        }
        else
        {
        выполняеться только если условие1 = false и условие2= false
        }

         */
        System.out.println(analyzeSaunaTemperature(15));

        System.out.println("Compare 3 and 13 : " + compareTwoNumbers(3,13));
        System.out.println("Compare 5 and 5 : " + compareTwoNumbers(5,5));

        System.out.println("Is 49 divided by 5 and 7 :" +isDividedBy5And7(49));
        System.out.println("Is 140 divided by 5 and 7 :" +isDividedBy5And7(140));

        int age = 33;
        int income = 30_000;

        if(age > 30 && income > 25000) 
        {
            System.out.println(" Даем кредит ");
        }



    }

    // функция которая принимает на вход число и возвращает  true если ето
    // число делится без остатка и на 5 и на 7

    public static boolean isDividedBy5And7(int number)
    {            // boolean            // boolean
        return ((number % 5) == 0) & ((number  % 7) == 0);
        //               false     &     true = false
    }



    // Напишем функция которая принемает на вход два числа и возвращает больше из них

    public static int compareTwoNumbers(int a,int b)
    {
        if (a>b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }

    public static boolean isDividedBy7(int number)
    {
        int reminder = number % 7;
        return reminder == 0;
    }

    public static String analyzeSaunaTemperature(int t)
    {
        /*
         > 80 Super Hot
         > 60 Great
         > 40 okey
        This is not a sauna
        */

        if(t>80)
        {
            return "Super Hot";
        }
        else if (t>60)
        {
            return "Great";
        }
        else if (t>40)
        {
            return "it's okey";
        }
        else
        {
            return "This is not a sauna";
        }
    }

}
