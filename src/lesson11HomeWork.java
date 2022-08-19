import java.util.Arrays;

public class lesson11HomeWork {
    public static void main(String[] args) {
        //                      0 1 2 3 4 5 6
        int[] value1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] value2 = new int[]{1, 2, 3, 3, 3, 3, 3};
        System.out.println(getThirdBiggest(value1));
        System.out.println(getThirdBiggest(value2));

        System.out.println(Arrays.toString(getCommonElements(new int[]{1,2,3,4},new int[]{1,3,5})));
        System.out.println(calculateAverage(new double[]{1,2,3,4}));
        System.out.println(calculateDispersion(new double[]{1,2,3,4}));
        System.out.println(isInside(new int[]{10,4,2,5},new int[]{10,2}));
        System.out.println(calculateArraySum(value2,0,value2.length));
        System.out.println(calculateGCD(18,30));

    }
    //7.Напишите функцию которая (желательно рекурсивно) посчитает
    // и вернет Наибольший Общий Делитель двух целых по алгоритму
    // Евклида (описание алгоритма можно посмотреть в википеди
    public static int calculateGCD(int a,int b)
    {
        int result = a % b;
        if (result == 0)
            return b;
        return calculateGCD(b,result);
    }





    //6.Напишите функцию которая рекурсивно посчитает и вернет сумму элементов массива целых
    // 0 1 2 3  4  5 6 7
    //10,6,3,55,14,1,2
    public static int calculateArraySum(int []a,int firstIndex,int lastIndex)
    {
        if(firstIndex == lastIndex-1)
            return a[firstIndex];
        else {
            int middle = (firstIndex + lastIndex)/2;
            return calculateArraySum(a,firstIndex,middle)+calculateArraySum(a,middle,lastIndex);
        }
    }



    // 5,Напишите функцию, в которую передаются два массива - "большой" и "маленький"
    // - функция должна вернуть true если все элементы "маленького" содержатся в "большом"

    public static boolean isInside(int[] l,int[] s)
    {
        int [] c = getCommonElements(l,s);
        return c.length == s.length;

    }

    //4.Напишите функцию которая вернет диcперсию значений
    // массива double (формулу для дисперсии можно посмотреть в википедии),
    // квадратный корень вычисляется с помощью Math.sqrt()

    public static double calculateDispersion(double [] a)
    {
        double average = calculateAverage(a);
        double sum = 0;
        for (int i = 0;i < a.length;i++)
        {
            sum += Math.pow((a[i]-average),2);
        }
        return sum/(a.length-1);
    }



    // 3.Напишите функцию которая вернет среднее значение
    // элементов массива double . Пример: {1,2,3,4} -> 2.5
    public static double calculateAverage(double [] a)
    {
        double sum = 0;
        for (int i = 0;i < a.length;i++)
        {
            sum += a[i];

        }
        return sum/a.length;

    }




    // 2.Написать функцию которая вернет в виде массива
    // общие элементы двух массивов. Пример: {1,2,3,4} {1,3,5} -> {1,3}
    public static int [] getCommonElements(int [] a,int [] b)
    {
        int size = Math.min(a.length,b.length);
        int [] c = new int[size];
        Arrays.sort(a);
        Arrays.sort(b);
       // {1,2,3,4} ia
       // {1,3,5}   ib
        for (int ia = 0,ib = 0,ic = 0; ia < a.length && ib < b.length;)
        {
            if(a[ia] ==b[ib])
            {
                c[ic++] = a[ia];
                ia++;
                ib++;
            }
            else if(a[ia] < b[ib])
                ia++;
            else if (b[ib] < a[ia])
                ib++;

            }
                int maxIndex = c.length -1;
                for (int i = maxIndex; i>= 0;i--)
                {
                    if (c[i] != 0)
                    {
                        maxIndex = i;
                        break;
                    }
                }
                int [] ret = new int[maxIndex +1];
                for(int i = 0;i < ret.length;i++) {
                    ret[i] = c[i];

                }

                return ret;

        }




    // 1.напишите функция ,которая передает третея по величине число в масиве
    //1,2,3,4,5,6,7 -> 5 ,1 2 3 3 3 3   -> 1

    public static int getThirdBiggest(int[] a) {
        Arrays.sort(a);   // операция сортировка -клас в java,сортира по големина
        int counter = 3;
        int prevMax = a[a.length - 1];
        for (int i = a.length - 2; i >= 0 && counter > 1; i--) {
            if (a[i] < prevMax) {
                prevMax = a[i];
                counter--;
            }
        }

        return prevMax;


    }

}
