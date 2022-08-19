import java.util.Locale;

public class lesson4 {
    public static void main(String[] args) {
        System.out.println(squareLength(10.5));
        System.out.println(getUserAddress("Stanimir", "Staykov", "Andonov"));
        System.out.println("5Years "+ calculate5YearsYield(1250,3.5,5));
        System.out.println("10Years "+ calculate5YearsYield(1250,3.5,10));
        System.out.println("20Years "+ calculate5YearsYield(1250,3.5,20));


        char a = 'A';
        char b ='B';
        char c = 100;
        char euro = '\u20AC';
        char dollar = '\u0024';
        // UTF-16

        String name = "Bob";

        System.out.println("a=" + a);
        System.out.println("b=" +b);
        System.out.println("c=" +c);
        System.out.println("Euro =" +euro);
        System.out.println("Dollar ="+dollar);

        char space = ' ';
        char tab = '\t';
        char newLine = '\n';

        String space1 = " ";


        String  firstName = "Max";
        String lastName = "Macron";
        int age = 38;
        System.out.println(firstName+lastName+age);
        System.out.println(firstName+space+lastName+space+age);
        System.out.println(firstName+tab+lastName+tab+age);
        System.out.println(firstName+newLine+lastName+newLine+age);
        System.out.println(firstName+space1+lastName+space1+age);

        String London = "London is a capital of Great Britain";

        System.out.println(London.length());
        System.out.println(London.isEmpty());
        System.out.println("  ".isEmpty());
        System.out.println("".isEmpty());

        String capital = London.substring(0,6);
        System.out.println(capital );
        System.out.println(London.toUpperCase());
        String data = "123456";
        int value = Integer.parseInt(data);

        System.out.println(value +44);

        System.out.println(Integer.parseInt("14 let".substring(0,2)));






    }


    //             тип                 параметьр
    public static double squareLength(double radii)
    {
        return 2 * Math.PI * radii;
    }

    public static String getUserAddress(String firstName, String lastName, String middleName)
    {
        return "6400, Dimitrovgrad ,bul.D.Blagoev bl.19 G-24;";
    }

    public static double calculate5YearsYield(double initialSum,double bankPercent,int years)
    {
        double p= bankPercent/100+1; // 1.035
        return initialSum*Math.pow(p,years); // правим все едно р на 5,10,20 степен
        // return initialSum*p+p+p+p+p
    }

    // char -това е един символ
    // String-редица,изречение,низ


}
