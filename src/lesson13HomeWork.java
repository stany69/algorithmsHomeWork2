import java.util.Arrays;

public class lesson13HomeWork {
    public static void main(String[] args) {


        int[] findPlace = new int[]{1, 5, 7, 12, 15};
        System.out.println(findTheRightPlace(findPlace, 7));
        System.out.println(findTheRightPlace(findPlace, 177));
        System.out.println(findTheRightPlace(findPlace, 4));


     //   LoanTaker max = new LoanTaker(33, 25000);
      //  LoanIssuer masha = new LoanIssuer(true, true);
     //   System.out.println(masha.checkLoanTaker(max));
    }

    //кредитополучатель

     class LoanTaker {
        int age;
        int annualSalary;

        //TODO написать конструктор

         public LoanTaker(int age, int annualSalary) {
             this.age = age;
             this.annualSalary = annualSalary;
         }

    }


    class LoanIssuer
            // TODO написать конструктор
    {

        boolean isLazy;
        boolean isKind;

        public LoanIssuer(boolean isLazy, boolean isKind) {
            this.isLazy = isLazy;
            this.isKind = isKind;
        }


        boolean checkLoanTaker(LoanTaker l)
        //TODO написать функцию проверяющею кредитополучателю
        {
            if (l.annualSalary >= 20000 && isLazy)
                return true;

            if (!isLazy && isKind && l.annualSalary > 20000 && l.age <= 70)
                return true;

            if (!isLazy && !isKind && l.annualSalary > 20000 && l.age <= 50)
                return true;


                return false;

            }
        }


        // Если работник ленивий то он одобрит кредит если доход больше 20 000
        // Если работник не ленивый но добрий ,то он одобрит кредит при доходе больше 20000 и возрасть не больше 70
        // Если работник не ленивый и злой  то он одобрит кредит при доходе больше 20000 и возрасти не больше 50


        // 2.Написать функцию которая принимает отсортированный массив и число.
        // Возвращает позицию числа в массиве если число там уже есть либо индекс куда
        // это число можно вставить не нарушив порядок сортировки массива findPlace({1,5,7,12,15}, 7) ->2
        // findPlace({1,5,7,12,15}, 4) -> 1 - реализовать методом binary search (двоичного поиска)

        public static int findTheRightPlace(int[] a, int number) {
            int m = 0;                               //int minIndex = 0;
            int h = a.length - 1;                     //int maxIndex = a.length-1;
            int l = 0;                               //
            while (l <= h) {                         //while (midIndex <= maxIndex)
                m = l + (h - l) / 2;                 //{  int midIndex = (minIndex+maxIndex) /2;
                if (a[m] == number) {                  //   if(a[midIndex] < number) }
                    return m;
                }                        //  {  minIndex = midIndex +1; }
                if (a[m] < number)                    //  else if (number < a[midIndex]
                {                                     // { maxIndex = midIndex-1; }
                    l = m + 1;                        // else { return midIndex; }
                    return l + m;                       // return minIndex;
                } else if (a[m] > number) {
                    h = m - 1;
                }


            }
            return m;
        }
    }



