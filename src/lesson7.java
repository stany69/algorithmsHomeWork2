public class lesson7 {
    public static void main(String[] args) {

        // break;
        // множественное условие

        // найти из диапазона 1 до 10000 первое число,которое делится на
        // и на 5 и на 7 и на 13
  /*
        int i = 1;
        int allReadyFound = 0;
       // while (i < 10000) //1.
        while (i < 10000 && allReadyFound < 2) // 2.
        {
            // TODO
            if(i % 5 == 0 && i % 7 == 0 && i % 13 == 0)
            {
                System.out.println(i);
               // break;//1. выйти из одного цикла
                allReadyFound++; //2.
            }
            i++;
        }   */

       /* int i = 0;
        do {
            System.out.println(i);
            i++;
            }
        while (i <= 10);  */

        int i = 1;
        do {
            System.out.println("while " + i);
            i++;
        } while (i <= 5);

        for (int j = 1; j <= 5; j++)
        {
            System.out.println("for " + j);
        }

        int sum = 0;
        for (int j = 10; j>= 2; j-=2)
        {
             sum += j;
            System.out.println("J " + j);
        }
        System.out.println("sum " + sum);


        /*
        for(операция 1-изпьлнява се само ведньж; условие; операция 2) for се използва
        преброяване,изброяване на нещо
         */
        // напишите через for  цикл печатающий числа с 10 до 2 с шагом -2

        for (int d = 10; d >= 2; d = d - 2)
        {
            System.out.println(" d" + d);
        }

        //TODO - switch- вьрви заедно с default
        // в case для switch можно изпользовать только конкретные значения
        int m = 7;
        String result ="";
        switch (m) // int,long,String;enum,short,char,boolean
        {
            case 3:
               // System.out.println("three");
                result = "three";
                break;
            case 2:
              //  System.out.println("two");
                result ="two";
                break;
            case 1:
              //  System.out.println("one");
                result = "one";
                break;
            default:
               // System.out.println("Unknown number");
                result = "Unknown number";
        }
        System.out.println(result);

        int weekDay = 5;
        switch (weekDay)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Work day");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }


    }

    public static void checkInterval(int a) {
        int i = 1; // переменная цикла
        while (i <= a) {
            if (i % 5 == 0 || i % 7 == 0 || i % 13 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }


}
