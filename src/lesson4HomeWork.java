import java.util.Locale;

public class lesson4HomeWork {
    public static void main(String[] args)  {

        System.out.println("четно 8: " + isEven(8));
        System.out.println("нечетно 11:" + isEven(11));

        char rouble= '\u20BD';
       char rouble1 = 0x20BD;
        System.out.println("Rouble " + rouble);
        System.out.println("Rouble " + rouble1);

        dataBasic("Stanimir" ,"Staykov",52);
        dataBasic("Ivan","Ivanov",29);

        String entryDenied = "Влизането забранено";
        String entryAllowed = entryDenied.substring(0,10)+ "разрешенo";
        System.out.println(entryAllowed);

        System.out.println(capitalize("Здравей,България"));
        System.out.println(greeting("Hello,you",'|'));



    }

    public static int isEven(int number)
    {
        // % деление с остатак или без
        return number % 2;
    }

    public static void dataBasic(String firstName,String lastName,int age)
    {
        final char newLine = '\n';

        System.out.println(firstName + newLine+lastName+newLine+age );
    }

    public static String capitalize(String text)
    {
        return text.toUpperCase();
    }

     public static String greeting(String string,char c)
     {
        return c + string +c;
     }




}
