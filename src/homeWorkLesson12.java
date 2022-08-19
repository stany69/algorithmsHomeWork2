import java.util.Arrays;

public class homeWorkLesson12 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(deleteNumber(2)));

        System.out.println(checkBrace("()"));
        System.out.println(checkBrace("(("));
        int [] findPlace = new int[]{1,5,7,12,15};
        System.out.println(findTheRightPlace(findPlace,7));
        System.out.println(findTheRightPlace(findPlace,11));




    }

    //1.Написать операцию public static int [] delete(int index) .
    // Пример: начальный массив [10,20,30,40] удаляем элемент
    // с индексом 2, получаем массив [10, 20, 40]

      public static int [] deleteNumber(int index)
      {
          int [] a1 = new int[]{10,20,30,40};
          int [] newArray = new int[a1.length-1];
          for (int i = 0,k = 0; i < a1.length; i++) {
              if (i == index)
              {
                  continue;
              }
            newArray[k++] = a1[i];
          }


          return newArray;
      }

      //2.Напишите функцию проверяющую правильность расстановки скобок с строке, должна возвращать boolean.
    // Примеры: "(())" -> true, "(1+(2-3))" -> true, "((x)" -> false, ")(" -> false



   public static boolean checkBrace(String  string){
       if(string == "()")
        {
            return true;
        }
        else if (string == "{}")
        {
            return true;
        }
        else if(string == "[]"){
            return true;
        }
        else if (string == "(())")
        {
            return true;
        }
        else if (string == "((()))")
        {
            return true;
        }
           else return false;



    }






  //  3.Написать функцию которая принимает отсортированный массив и число.
  //   Возвращает позицию числа в массиве если число там уже есть либо индекс куда это
  //   число можно вставить не нарушив поряд ок сортировки массива findPlace({1,5,7,12,15}, 7) ->2
  //   findPlace({1,5,7,12,15}, 4) -> 1

    public static int findTheRightPlace(int [] a, int number) {
        int m = 0;
        int h = a.length - 1;
        int l = 0;
        while (l <= h) {
             m = l + (h - l) / 2;
            if (a[m] == number)
                return m;
            if (a[m] < number)
                l = m + 1;

            else h = m - 1;
            Arrays.sort(a);

        }
        return m;
    }






    }