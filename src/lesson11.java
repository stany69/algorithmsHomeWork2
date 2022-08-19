public class lesson11 {
    @SuppressWarnings("InfiniteLoopStatement")
    public static void main(String[] args) {

        // посчитать сумму всех нечетных индексов в массиве
        int sum = 0;
        int [] array = new int[]{1,5,7,-10,2};
        for (int i = 0; i < array.length;i++)
        {

            if (i % 2 ==0)
            continue;   // переход к следующем итераций цикла,когда вы не хотите чтобы код ниже в
                        // циклах while или for выполнялся,continue переходит сразу к следующею итерацию
          sum += array[i];
        }

        //нужно убедится,что в двухмерном массиве есть определенное число
        int [][] array2D = new int[][]
                {
                        {11,43,1},
                        {-12},
                        {14,44,-2,-10}

                };
        int Number = -12;
        outerFor:
        for(int i = 0;i < array2D.length;i++)
        {
          for (int j =0;j < array2D[i].length;i++)
          {
            if(array2D[i][j]==Number);
            break outerFor;
          }
        }

        // Рекурсия - вызов функция самой себя
        // Рекурсия трбует две условия
        // Нужна задача которыя имеет рекуррентное решение
        // Точка в который алготитм останавливается

        /*
        f(n) = 2^n
        f(n) = 2*(n-1) = 2*2^(n-1)
        f(n) = 2*(n-1) = 2*2*f(n-2)=2*2*2^(n-2)
        Точка остаановки алгоритма ето n = 0 -> 2^0 = 1 ->1
         */
        System.out.println(f(10));

        // напишите функ.,которыя рекурсивно вычисляет факториал
        // n!= 1*2*3*4....*n

        System.out.println(factorial(4));
    }

    public static long factorial(int n)
    {
        if(n==1)
            return 1;
        return n*factorial(n-1);
    }

    public static long f(int n)
    {
        if(n == 0)
            return 1;
        return 2*f(n-1);
    }
}
