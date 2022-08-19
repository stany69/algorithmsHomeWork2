public class lesson7HomeWork {
    public static void main(String[] args) {
        System.out.println("Capital in 5 Years :" +compoundPercent(2000,5.0,5));
        System.out.println("Capital in 10 Years :" +compoundPercent(2000,5.0,10));
        System.out.println("Capital in 20 Years :" +compoundPercent(2000,5.0,20));
       //  System.out.println("RESULT IS " +calculator(2,0x002A,3));
        printNumbers(1,10,2);
        System.out.println("Sum is " + returnSum(1,10,2));

    }

    //1.Написать функцию, которая принимает на вход три целых числа A, B, C
    // и распечатывает все числа от A до B с шагом С (A < B и C > 0) с помощю for
       public static void printNumbers(int a,int b,int c)
       {
           b=10;
           c=2;
        for(a = 1;a<= b;a +=c)
        {
            System.out.println(a);

        }

       }

    // 2.Написать функцию, которая принимает на вход три целых числа A, B, C
    // и возвращает сумму чисел от A до B с шагом C (A < B и C > 0)  с помощю for

    public static int returnSum(int a,int b,int c)
    {
        int sum = 0;
        b=10;
        c=2;
        for (a = 1;a <= b;a +=c)
        {
            sum +=a;
        }
        return sum;
    }








    // 3.Написать функцию, которая принимает на вход целое число A, перебирает все числа от 1 до A
    // и печатает только те из них, которые делятся
    // или на 5, или на 7 или на 13 без остатка с помощю for
   /* public static void dividedNumber(int a)
    {

        for(a = 1;a<= 90;a +=2)
        {

            if(a % 5 ==0 || a % 7 ==0 || a % 13 == 0);
            System.out.println(a);

        }
    }
    */

    // 4.Напишите функцию для расчета "сложных" процентов - должна принимать на вход сумму,
    // процент и количество лет. Должна возвращать сумму по окончании вклада.

    public static double compoundPercent (double depositedMoney,double ratePerYear,int years)
    {
        double b = ratePerYear/ 100+1;
        return depositedMoney*Math.pow(b,years);
    }


    // 5.Напишите функцию возвращающую факториал переданного в нее целого числа. Пример: 4! = 1*2*3*4 = 24


    // 6.Напишите функцию, дешифрующую ввод с телефона - принимает на вход char,
    // возвращает целое. Пример: A,B,C - > 2; J,K,L -> 5





    //7.Напишите функцию калькулятор - принимает на вход два doulbe и char
    // c операцией - * / + - Возвращает результат операции.
     // public static double calculator(double a, char c, double b)
{
    //{
       // double result = a + c +b;
       // return result;
   // }
}

    // 8. Напишите функцию, переворачивающую строку - пример: Петя -> ятеП

    // 9.* Напишите функцию которая рисует пирамидку заданной высоты - пример для числа 4
    //   *
    //  ***
    // *****
    //*******

}
