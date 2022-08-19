import java.util.Arrays;

public class homeWorkLesson9 {
    public static void main(String[] args) {

        //  System.out.println(sumArray(a);


        int[] a = new int[]{4, 5, 6, 7, 8};
        int[] test = {2, 17, 14, 5, 3, 3, 3, 30};
        // printArrayReverse();
        // System.out.println(printArrayReverse(a[i]);

        //3. Создать двухмерный массив и заполнить его цифрами от 99 до 0
        int[][] array10x10 = new int[10][10];
        // int result = 0;
        for (int i = array10x10.length - 1; i >= 0; i--) {
            for (int j = array10x10[i].length - 1; j >= 0; j--) {
                array10x10[i][j] = array10x10.length * i + j;

            }
        }
        int[] f = new int[]{1, 2, 3};
        //  int [] a= new int[]{-1,2,4,-13};
        reverseArrayReverse(a);
        System.out.println(Arrays.toString(a));
        print1DArryay(test);

        int[][] test2D = new int[10][10];
        int k = 99;
        for (int i = 0; i < test2D.length; i++) {
            for (int j = 0; j < test2D[i].length; j++) {
                test2D[i][j] = k--;
            }
        }

        print2DArray(test2D);

        int[] testPositivity = new int[]{1, -4, -8, 2};
        multiplyPositiveBy2(testPositivity);
        print1DArryay(testPositivity);
        System.out.println(checkPositive(test2D));

        int[][] testPositive = new int[][]
                {
                        {1,2,3},
                        {-11},
                        {34,-3}
                };
        System.out.println(check2DPositive(testPositive));
        System.out.println(calculate2DPositiveSum(testPositive));


    }

    //1, Написать функцию, возвращающую сумму всех четных
    // элементов передаваемого в нее массива. Пример {2, 17, 14} -> 16
    public static int sumArray(int[] a) {
        int sum = 0;
        //  int [] a = new int[] {1,2,5,8};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) ;
            sum += a[i];
        }


        return sum;

    }


    //2 Развернуть передаваемый в функцию массив задом наперед. Пример {17, 4, 5} -> {5,4,17}
    public static void reverseArrayReverse(int[] a) {
        //   for (int i = a.length-1;i >=0;i--)
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }


    }


    // 3. Создать двухмерный масив и заполнит его с цифрами от 99 до 0

    public static void print2DArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            print1DArryay(a[i]);
        }
    }

    public static void print1DArryay(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }


    //4. Написать функцию которая умножает на 2 все положительные
    // элементы передаваего в нее массива

    public static void multiplyPositiveBy2(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) ;
            a[i] *= 2;
        }
    }


/* public static void multiplyTo2 (int [] a)
 {     int b = 0;
     for (int i = 0;i < a.length;i++){
         if (a[i] > 0);
         {
               a[i]= a*2;
         }*/
    //  System.out.println(multiplyTo2(b);


    //}

    //5. Напишите функцию котрорая принимает двухмерный массив и возвращает
    // true если в нем нет отрицательных элементов

    public static boolean checkPositive(int [][] a)
    {
        for (int i = 0;i< a.length;i++)
        {
            for (int j =0;j<a[i].length;j++)
            {
                if (a[i][j]<0);
                return false;
            }
        }
        return true;
    }
    //6  Напишите функцию принимающую двухмерный массив и возвращающую
    // количество подмассивов, содержащих только положительные элементы.
    // Пример { {1,2,3}, {-11},{34,-3}} -> 1

    public static int check2DPositive(int[][] a)
    {
        int numberOfPositive = 0;
        for (int i = 0;i< a.length;i++){
            boolean flagOnlyPositive = true;
            for (int j =0;j<a[i].length;j++)
            {
              if (a[i][j] <0){
                  flagOnlyPositive = false;
                  break;
              }
            }
            if(flagOnlyPositive)
                numberOfPositive++;
        }
        return numberOfPositive;
    }



    //7  Вернуть сумму чисел двухмерного массива только для тех
    // подмассивов в которых нет отрицательных элементов. Пример {
    // {1,2,3},
    // {-11},{34,-3}
    // } -> 6

        public static int calculate2DPositiveSum(int[][] a)
        {
            int sum = 0;
            for (int i = 0;i< a.length;i++)
            { boolean hasPositive = true;
                int subArraySum = 0;
                for (int j =0;j<a[i].length;j++)
                {

                   if(a [i][j] < 0)
                   {
                       hasPositive = false;
                       break;
                   }
                    subArraySum += a[i][j];
                }
                if(hasPositive)
                    sum += subArraySum;
            }
            return sum;
        }
}