import java.util.Arrays;

public class lesson9 {
    public static void main(String[] args){


        int [] intArray = new int[] {15,444,-90,-2};
        //                            0, 1 ,  2, 3
        System.out.println(intArray[2]); // номер ящика 2,значение -90
        intArray[1] = 555;
        System.out.println(intArray[1]);
        System.out.println("array lenght is : " + intArray.length);
        System.out.println(Arrays.toString(intArray)); //функция Arrays.toString,разпечатва
        // садьржанието в редица
        printArray(intArray);
        int [] a1 = new int [] {1,-10,1};
      //  fillArrayMultiplayBy3(a1);
        System.out.println(Arrays.toString(a1));
        makeElementsPositive(a1);
        System.out.println(Arrays.toString(a1));

        int [] []dim2Array= new int[] []
                {
                        {1,7,3},  //0
                        {-10,18}, //1
                        {2,5,18,13} //2
                }; //    0,1, 2, 3
        System.out.println(dim2Array.length); //3
        System.out.println(dim2Array[2][3]);
        int [] secondSubArray = dim2Array[2];
        System.out.println(secondSubArray[3]);

        int [][] array10x10 = new int[10][10];
        for (int i = 0;i < array10x10.length;i++)
        {
            for(int j= 0;j < array10x10[i].length;j++)
            {
                array10x10[i][j] = array10x10.length*i+j;
            }
        }

        //тречмерный масив
        int [][][] dim3Array = new int[][][]
                {
                        {
                                {1,7,9},
                                {31},
                                {2,6,-8,12,18}
                        },
                        {
                                {-90,43,15},
                                {5},
                        }
                };
        System.out.println("dim3Array.lenght " + dim3Array.length);
        System.out.println(dim3Array[0][2][4]); //18



    }

    public static void printArray(int [] a){
        for (int i = 0;i< a.length;i++)
        {
            System.out.println("a[" + i + "]=" +a[i]);
        }
    }

    // напишите ф/я заполните масив елементами равним 3 по индекс масива
    public static void fillArrayMultiplayBy3(int[] a)
    {
        for (int i = 0;i <a.length;i++)
        {
            a [i] = i*3;
        }
    }

    public static void makeElementsPositive(int [] a)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<0)
                a[i] *= -1;
        }
    }


}