public class lesson3 {
    public static void main(String[] args) {
        int a = 6;
        int b = 5;
        /*
         * / + - %
         */
        System.out.println("a: " + a); // 6
        a = a / 3;
        System.out.println("a: " + a); // 2
        --a;
        System.out.println("a: " + a); // 1

        //  a =a+ 15;
        a += 15;
        System.out.println("a : " + a);

        int recArea = rectangleArea(a=10,b=15);
        System.out.println("Rectangle area is: "+ recArea);


    }

    public static int rectangleArea(int a,int b)
    {
        return a*b;
    }

}







