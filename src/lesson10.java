import java.util.Arrays;

public class lesson10 {
    public static void main(String[] args) {

        int [] array1D = {1,2,3,4};
        System.out.println(Arrays.toString(array1D));
        System.out.println(print1DArray(array1D));

        int [] araryToSort = {12 ,-6, 7, 4, 10};
        System.out.println(print1DArray(araryToSort));
        insertionSort(araryToSort);
        System.out.println(print1DArray(araryToSort));
        String [] names = {"Sting","Kirkorov","Pink Floyd","Ramstein"};
        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

    }

    public static void insertionSort(int[]a)
    {
        for (int i = 1;i < a.length;i++)
        {
            int j = i; // i = 2; j= 2;
            // 2 >= 1;        7   <     12
            while (j >= i && a[j] <= a[j-1])
            {
                int temp = a[j-1];
                a[j-1] = a[j];
                a[j] = temp;
                j--;
            }
        }
    }

    public static String print1DArray(int [] a) {
        String res = "[";
        for (int i = 0; i < a.length; i++) {
            res += a[i];
            if (i != a.length - 1)
                res += ", ";

        }
        res += "] ";
        return res;
    }


         //сортировки
    //  {1,9,3,-5,81} ->
    // {-5,1,3,9,81}
    //вычислительная сложность алгоритма определяеться количеством  операций,
    // которье нужно для того что бы успешно завершит его в самым худшем случае.
    // n = количество елементи в масива
    // n 0(n), 0(n^2), 0(n*log(n))
    // 0(n^2) 1000*1000 = 1 000 000
    //0(n*log(n)) 1000*3 = 3000
    // insertion sort
    // бя 12,-6,7,4,10
    //тряа да стане -6,4,7,10,12
    // ---------------------------
    //  0  1  2  3  4
    // 12 ,-6, 7, 4, 10
    // -6 12 7  4 10
    // -6 7 12  4 10
    // -6 7 4  12 10
    // -6 4  7 12  10
    // -6 4  7  10 12
}
