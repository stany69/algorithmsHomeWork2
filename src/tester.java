public class tester {
public static void main(String[] args){
    System.out.println("5+5"  +  "hello");
    System.out.println(5+5);
    System.out.println("5" +5);
    System.out.println("hello"+5);
    System.out.println("5+5="+(5+5));


    int counter; // объявление переменной
    counter=101; // иницилизация
    System.out.println("counter:"+counter);

    int area= 125; // объявление переменной с инициализация
    System.out.println("area is:"+area);

    area=area*2;
    System.out.println("area is:"+area);

    int hex=0xabc; // prefix 0x
    System.out.println("hex:"+hex);

    int binary=0B101;  // prefix 0B
    System.out.println("binary:"+binary);

    int octal = 0101; // prefix 0
    System.out.println("octal:"+octal);

    int millis = 50_000_000;
    System.out.println("millis:"+millis);

   // int big = 45556667774444;
    long big= 185L; // суфикс L или малко   l накрая
    long anotherLong = 66l;

    System.out.println("long sum:"+(big+anotherLong+4000));

    int myBigInt=(int)big;

    System.out.println("big:"+big);
    System.out.println("myBigInt:"+myBigInt);

    int height = 44;
    System.out.println("main height:"+height);
    fly();
    run();

}
   // методы и названия переменных используется camelCase
    // MILLIS - не правильно !!!  millis-правильно
    // numberOfBirds-переменные
    // flyToAfrica()-методы
    // CalculatorReceiver -класс(първа буква голяма)

    public static void fly()
    {
    int height = 14;
        System.out.println("fly height:"+height);

    }
     public static void  run()
     {
         int height = 3;
         System.out.println("run height:"+height);

         printjava();
         calaculateMaxOilVolume();
         moneyOfMarta();


     }

     public static void printjava(){

        System.out.println("...................................");
        System.out.println("   j     a      v     v      a");
        System.out.println("   j    a  a     v   v      a  a");
        System.out.println("j  j   aaaaaa     v v      aaaaaa ");
        System.out.println(" jj   a      a     v      a      a");
        System.out.println("....................................");
    }

    public static void calaculateMaxOilVolume(){

    int area=450;
        System.out.println("area="+450+"m2");

        int height=12;
        System.out.println("height="+12+"m");
        System.out.println("volume="+(area*height)+"m3");
        int volume=5400;
        int pipe = 23;
        System.out.println("pipe="+23+"m3");
        System.out.println("maximum volume="+(volume-pipe)*1000+ "liter");




    }

    public static void moneyOfMarta(){

    int startOfTheDay = 41;
    int coffee=3;
    int apples = 3;
    int lunch = 12;
    int bonus = 350;
        System.out.println("Marta has "+(startOfTheDay-coffee-(apples*2)-lunch+bonus )  +   " euro at the end of the day");



    }









}