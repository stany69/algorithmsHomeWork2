public class lesson6 {
   public static void main(String[] args) {
   // int,boolean,float,char- примитивные == по значение
       // String - ссылочный == по адесу в памяти,equals-сравнение по значение

       String a = "DIMA";
       String b = "dima".toUpperCase();
        System.out.println("a :" +a);
        System.out.println("b :" +b);


       System.out.println("DIMA == DIMA   "+ (a==b)); //сравнение по адреса в паметта
       System.out.println("DIMA.equals(DIMA )  "+ a.equals(b)); // сравнение по стойност

      // Цикл - блок кода , который потенциально может повторяться несколько раз
       // в зависимость от условия

       /*
       while(< логическое выражение >)
       {
       < выполняется блок кода если логическое выражение == true >
       }
        */

       int number = 1;
       while (number<10) // 10 < 10
       {
           System.out.println("number is :" + number);
           number = number+1; // number + 1;  или  number++ и трите са едно и съшо
       }

      // int a = 18;
      // a = a * 8; // a *= 8;
      // a = a - 8; // a -= 8;
      // a = a % 3; // a % = 3;

       //Напишите цикл который печатает цифры с 20 до 5 с шагом - 2

       int temp = 20;
       while (temp > 5 )

       {
           System.out.println("temp is :" + temp);
           temp = temp -2; // temp -= 2;
       }

       // посчитайте сумму всех чисел от 1 до 87 вкл.

       int counter = 0;
       int i = 1;
       while (i<= 87)
       {

           counter = counter+i;
           i = i + 1;

       }

       System.out.println("sum is :" + counter);


       // FizzBuzz
       //пробежатся в цикле от 1 до 50 с шагом 1
       // если переменная цикла делится на 3 без остатък печатает Fizz
       // если переменная делиться на 5 без остатък печатать Buzz
       // если переменная цикла делится и на 3 и на 5 без остатка печатать FizzBuzz


       int f = 1;
       while (f <=50)
       {
           if(f % 3 == 0 && f % 5 ==0)
           {
               System.out.println("FizzBuzz " +f);
           }
           else if(f % 3 == 0)
           {
               System.out.println("Fizz " + f);
           }
           else if (f % 5 == 0)
           {
               System.out.println("Buzz "+ f);
           }
           f = f +1;
       }




   }

}




