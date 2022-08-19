public class lesson5 {
    public static void main(String[] args) {

        System.out.println(sum(10.5,20.50,31.5));

        System.out.println(Math.pow(12,2)); // степенуване 12 на втора

        boolean isSunny = true; // false

        // ЛОГИГЕСКИ ОПЕРАЦИИ
        // & -  и and
        // | -  или   or
        // ! -  не  not
        // ^ -  логическое или - xor

        // & -and
        System.out.println(true&true); // true
        System.out.println(true&false); // false
        System.out.println(false&false); // false

        System.out.println("------------------------------");

        // | - or
        System.out.println(true|true); // true
        System.out.println(true|false); // true
        System.out.println(false|false); // false

        System.out.println("------------------------------");

        // ! - not
        System.out.println(!true); // не истина = false
        System.out.println(!false); // не лъжа = true

        System.out.println("------------------------------");

        // ^ xor
        System.out.println(true^true); //false
        System.out.println(true^false); //true
        System.out.println(false^false); // false

        System.out.println("------------------------------");
        System.out.println(false&false&true); // false
        System.out.println((false|false)&true); // false
        System.out.println(false|false&true); // false



    }

    public static double sum(double a,double b,double c)
    {
        return a+b+c;
    }

     // логический тип данных boolean true,false

}
