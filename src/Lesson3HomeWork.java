public class Lesson3HomeWork {
    public static void main(String[] args) {

        final double pi = 3.14;
        int a = 8; //length of large half-axle ellipse
        int b = 5; // length of short half-axle ellipse

        int d = 12;  //diameter of circle

        double ellipseAreaIs = areaOfEllipse(8,5,3.14);
        System.out.println("ellipse area is " + ellipseAreaIs);


        double length = lengthOfCircle(12, 3.14);
        System.out.println("lengthOfCircle is " + length);


        int startCapital = 1250;
        final double ratePerYear = 1.035;  // 3.5 %  per Year

        double moneyInFiveYears = inFiveYears( 1250, 1.035);
        System.out.println("money In Five Years is " + moneyInFiveYears);

        //double theFirstYear = startCapital*ratePerYear+startCapital;
        // double theSecondYear = theFirstYear*ratePerYear+theFirstYear;
        //double theThirdYear = theSecondYear*ratePerYear+theSecondYear;
        // double theFourthYear = (theThirdYear * ratePerYear) + theThirdYear;;
        // double theFifthYear = theFourthYear * ratePerYear + theFourthYear;

        //System.out.println("moneyInFiveYears are  " + theFifthYear);
    }


    public static double lengthOfCircle(int d, double pi)
    {
        double length = d * pi;
        return length;
    }
    public static double areaOfEllipse(int a,int b,double pi)
    {
        double ellipseAraeIs = a*b*pi;
        return ellipseAraeIs;

    }

    public static double inFiveYears ( int startCapital, double ratePerYear)

    {
        double moneyInFiveYears = (startCapital * ratePerYear) * ratePerYear * ratePerYear * ratePerYear * ratePerYear;
        return moneyInFiveYears;

    }

}






