import java.util.Arrays;

public class lesson12 {
    public static void main(String[] args) {

        // Операций с массивами

        int [] a1 = {1,2,3,4};
        System.out.println(Arrays.toString(append(a1,5)));
        System.out.println(Arrays.toString(insert(a1,1,10)));
    }

    public static int [] append (int [] a,int number)
    {
        int [] ret = new int[a.length +1];
        for (int i = 0;i < a.length;i++){
            ret[i] = a[i];
        }
        ret[ret.length -1] = number;
        return ret;
    }

    public static int [] insert(int [] a,int index,int number)
    {
        // 1,2,3,4   1,10  -> 1,10,2,3,4
        //вставить в середину массива а значение ,вернуть новый массив
        int [] pes = new int [a.length + 1];
        for (int i = 0; i < index ; i++) {
            pes[i] = a[i];

        }
        pes[index] = number;
        for (int i = index+1; i < pes.length; i++) {
            pes[i]  = a[i-1];

        }
            return pes;
        }


    }





