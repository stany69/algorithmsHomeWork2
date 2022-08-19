import java.util.Arrays;

public class lesson8HomeWork {
    public static void main(String[] args) {


    int [] array = new int [] {9,18,22,14,33,6,8,12,58,19};
      printArray(array);
        System.out.println("---------------");
        countdownNumbers(array);
        printArray(array);
    //  String [] a= {Петя};

        System.out.println(Arrays.toString(getChars("Петя")));
        System.out.println(Arrays.toString(new char [5]));

        int[] negativeArray = new int[] {-1,-10};
        System.out.println(positiveNumbers(negativeArray));
        System.out.println(positiveNumbers(array));

        System.out.println(findNumber(negativeArray,-10));
      //  System.out.println(hex2bin(hexChar2Bin("1abd")));

    }
    public static void printArray(int [] a)
    {
        for (int i = 0;i< a.length;i++)
        {
            System.out.println("a[" +i+"]="+a[i]);
        }
    }

   // 1.напишите функцию, принимающую на вход массив int и заполняющую массив
    // в обратном порядке - если в массиве 10 элементов , то сделать
    // значениями элементов 9,8,7 ... 0

    public static void countdownNumbers(int [] a)
            //10,9,8,7......
    {
        for (int i = 0; i < a.length ; i++)
        {
            a[i] = a.length -1-i;
            // a[0] = 10 -1-0 = 9
            System.out.println(a[i]);
        }
    }
    //2.напишите функцию, возвращающую массив из char
    // передаваемой в нее строки - "Петя" -> 'П', 'е', 'т', 'я' - обратите
    // внимания на метод String charAt
    public static char[] getChars(String text)
        {   // Петя
           char [] c = new char[text.length()]; // '','','',''
           for (int i = 0;i < text.length();i++)
           {   // c[0] = Петя[0] = П
               c[i] = text.charAt(i);
           }
           return c;
        }


   // 3.напишите функцию, которая определяет, если в передаваемом
    // массиве целых положительные числа, возвражает boolean

        public static boolean positiveNumbers(int[]a)
    {
             for(int i = 0; i < a.length; i++)
        {
          if( a[i] > 0)
              return true;

        }
           return false;
    }

   // 4.напишите функцию, которая определяет, если в
  //  передаваемом массиве целых заданное целое число, возвражает
    //  boolean - на вход функции передается массив целых и целое число

        public static boolean findNumber(int [] a,int b)
        {
            for (int i = 0;i < a.length;i++)
            {
              if(a[i] == b)
                  return true;
            }

            return false;
        }

  // 5.напишите функцию, которая для передаваемого туда шестнадцатиричного
    // числа в виде строки возвратит его двоичную запись в
  //  виде строки  "1abd" -> "0001 1010 1011 1100"
/*
     public static String hex2bin(String h)
     {
        String ret ="";
        for(int i = O;i < h.length();i++){
            ret += hexChar2Bin(h.charAt(i));
            ret += " ";

        }
        return ret;
     }

     public static String hexChar2Bin(char h)
     {
        return switch (h)
                {
                    case ‘0‘ -> "0000";
                    case ‘1‘ -> "0001";
                    case ‘2‘ -> "0010";
                    case ‘3‘ -> "0011";
                    case ‘4‘ -> "0100";
                    case ‘5‘ -> "0101";
                    case ‘6‘ -> "0110";
                    case ‘7‘ -> "0111";
                    case ‘8‘ -> "1000";
                    case ‘9‘ -> "1001";
                    case ‘a‘ -> "1010";
                    case ‘b‘ -> "1011";
                    case ‘c‘ -> "1100";
                    case ‘d‘ -> "1101";
                    case ‘e‘ -> "1110";
                    case ‘f‘ -> "1111";
                    default -> "XXXX";
                };
     }

     */









}









