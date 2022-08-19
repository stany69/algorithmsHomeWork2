import java.util.Arrays;

public class homeWorkLesson10 {
    public static void main(String[] args) {

        int [][] array = new int[][]{
                {1,2,3},
                {-3,2,4},
                {-33}
        };
        System.out.println(calculateNumbersOfNegativeSubArrays(array));

        int [] first = new int[]{1,2,3,4};
        int [] second = new int[]{10,20,-3,-4};
        int [] third = new int[]{-10,-20,-30,40};
        System.out.println(Arrays.toString(calculateMaximums(first,second,third)));
        int [] arrayToSort = new int[]{4,3,-2,8,1};
                selectionSort(arrayToSort);
        System.out.println(Arrays.toString(arrayToSort));
        System.out.println(getThirdBiggest(arrayToSort));


    }
    // напишите функция ,которая передает третея по величине число в масиве
    //1,2,3,4,5,6,7 -> 5
    public static int getThirdBiggest(int [] a)
    {
        Arrays.sort(a);
       // selectionSort(a);
        return a[a.length-3];
    }

    // 3.* Написать алгоритм сортировки selection sort (сортировка выбором)
    //меняет местами елементы в массиве по индексам
    public static void selectionSort(int [] a)
    {
        for (int i = 0; i < a.length-1;i++)
        {
            swap(i,findMinimumArrayIndex(i,a),a);
        }
    }


    public static void swap (int firstIndex,int secondIndex,int [] a)
    {
        int temp = a[firstIndex];
        a[firstIndex] = a[secondIndex];
        a[secondIndex] = temp;
    }

    // Ищет индекс минимального елемента в массиве
    public static int findMinimumArrayIndex(int from,int [] a)
    {
        int minIndex = from;
        int minimum = a[minIndex];
        for (int i = from+1; i < a.length;i++)
        {
          if(a[i] < minimum)
          {
              minimum = a[i];
              minIndex = i;
          }
        }
        return minIndex;
    }



    // 2.Напишите функцию, которая принимает на вход три массива и
    // возвращает массив с максимами каждой из "троек" числе public static int[]
    // getMaximum(int [] a, int [] b, int [] c) - массивы a, b и c одинаковой длины.
    // Тройками считаютя a[0], b[0], c[0] ... a[n], b[n], c[n], n меняется от 0 до a.length-1
     public static int [] calculateMaximums(int [] a,int [] b,int [] c)
     {
         int [] result = new int[a.length];
         for (int i = 0;i < a.length;i++)
         {
             result[i] = max(c[i],max(a[i],b[i]));
         }


         return result;
     }
     public static int max(int a,int b)
     {
         return a > b ? a:b;
     }


    // 1.Напишите функцию, которая принимает двухмерный массив и
    // возвращает количество подмассивов с отрицательными элементами
    public static int calculateNumbersOfNegativeSubArrays(int [][] a)
    {
         int count = 0;
         for (int i = 0;i < a.length;i++)
         {
              for (int j=0;j< a[i].length;j++)
              {
                if(a[i][j] < 0)
                {
                    count++;
                    break;
                }
              }
         }
         return count;
    }









}
