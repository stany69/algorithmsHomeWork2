public class lesson6HomeWork {
    public static void main(String[] args) {

        printInterval(1, 9, 5);
        System.out.println(calculateSum(1, 9, 5));


        // 10 9 8 7 6 5 4 3 2 1
        int begin = 10; // переменная цикла
        while (begin >= 1)
        {
            System.out.println(begin);
            begin--;
        }

        checkInterval(29);

        // 4.*  Маша выдает в месяц 50 кредитов. Петя выдает в месяц 0.8 от
        // Маши и Вася выдает в месяц 0.9 от Пети. За сколько месяцев они вместе выдадут
        // 1430 кредитов? Ответ должен представлять собой целое число; используйте while.

        int monthlyCredits =(int) (50 + 0.8*50 + 0.9*0.8*50);
        int sum = 0;
        int month = 0;
        while (sum <= 1430)
        {
            sum += monthlyCredits;
            month++;
        }
        System.out.println("months :" + month);


        // 5 * Распечатайте все числа Фибоначчи, находящиеся в диапазоне от 1 до 100.

        int a = 0;
        int b = 1;
        while (b <= 100)
        {
            System.out.println(b);
            int temp = b;
            b = b +a;
            a = temp;
            //  a <<<<<< b
            // b  <<<<<< a+b
        }


        // 6 ** Вывести на экран таблицу умножения. 1*1=1        1*2=2 ...    9*9=81 .
        // Используйте while внутри while.
        // Нужно напечатать ВСЮ таблицу умножения - всех чисел от 1 до 9 на все числа от 1 до 9.
        // 1 * 1 = 1
        // .....
        // 9 * 9 = 81
        int left = 1;
        while (left <= 9)
        {
            System.out.println("***************************************");
            int right = 1;
            while (right <= 9)
            {
                System.out.println("" + left + "*" + right + "=" + (left * right));
                right++;
            }
                    left++;
        }


    }


    // 1. Написать функцию, которая принимает на вход три целых числа A, B, C
    // и распечатывает все числа от A до B с шагом С (A < B и C > 0)

    public static void printInterval(int a, int b, int c) {
        while (a <= b) {
            System.out.println(a);
            a += c;
        }
    }

    // 2.Написать функцию, которая принимает на вход три целых числа A, B, C
    // и возвращает сумму чисел от A до B с шагом C (A < B и C > 0)
    // от числа 1 до число 9 с шагом 5
    //                                 1      9      5
    public static int calculateSum(int a, int b, int c) {
        int sum = 0;
        //TODO подсчитать сумму
        while (a <= b) // 1 <= 9, 6 <= 9
        {
            sum += a; // 1 ,7
            a += c;  // 6, 11-false

        }
        return sum;
    }


    // 3.Написать функцию, которая принимает на вход целое число A,
    // перебирает все числа от 1 до А и печатает только те из них,
    // которые делятся или на 5, или на 7 или на 13 без остатка

    public static void checkInterval(int a)
    {
        int i = 1; // переменная цикла
        while(i <= a)
        {
            if(i % 5 ==0 || i % 7 ==0 || i % 13 == 0)
            {
                System.out.println(i);
            }
            i++;
        }

    }










}