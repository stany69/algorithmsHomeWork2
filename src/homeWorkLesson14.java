public class homeWorkLesson14 {
    public static void main(String[] args) {
        /*
        HomoSapiens2 katya = new HomoSapiens2("Katya","Ivanova",20);
        katya.introduce();
        HomoSapiens2 max = new HomoSapiens2("Max", "Kotkov", 30);
        max.introduce();

        HomoSapiens2 vasya = new HomoSapiens2("Vasya", " Petrov", 40);
        vasya.introduce();
        vasya.getLastName();
        vasya.introduce();
        vasya.setLastName("Petrov");
        vasya.introduce();



        System.out.println(HomoSapiens2.numberOfHumans);
        System.out.println(HomoSapiens2.averageAge);
        HomoSapiens2 sam = new HomoSapiens2( "Sam","Smith",32);
        HomoSapiens2 dick =new HomoSapiens2("Robert","SIemens",28);
          dick.die();
        System.out.println("Average age " + HomoSapiens2.averageAge);
        System.out.println("Average people " + HomoSapiens2.numberOfHumans);

   */
        HomoSapiens2 sam =new HomoSapiens2("Sam","Smith",32);
        HomoSapiens2 dick =new HomoSapiens2("Rob","Siemens",28);

        sam.die();
        sam.introduce();
        dick.die();

        System.out.println("Average age: "+ HomoSapiens2.averageAge);
        System.out.println("Number of age "+ HomoSapiens2.numberOfHumans);

        sam.die();
        System.out.println("Average age: "+ HomoSapiens2.averageAge);
        System.out.println("Number of age "+ HomoSapiens2.numberOfHumans);

    }



}


class HomoSapiens2 {

    public static int numberOfHumans = 0;
    public static double averageAge =0;

    public boolean isAlive = true;

    private String lastName;
    String firstName;
    int age;

    public void die() {
        if(isAlive){
            isAlive = false;
        }
        if (numberOfHumans==1)
        {
            numberOfHumans =0;
            averageAge =0;
        }else
        averageAge = (numberOfHumans * averageAge - age) / --numberOfHumans;
    }

    //  if(numberOfHumans==1)

    public String getLastName() {   //
        return lastName;
    }
    void setLastName(String lastName){
        this.lastName=lastName;
    }



    public HomoSapiens2()
    {

        this("","",0);

    }

    public HomoSapiens2(String firstName, String lastName) {

        this(firstName,lastName,0);

    }




    public HomoSapiens2(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
       // public boolean isAlive = true;
        averageAge = (averageAge*numberOfHumans +age)/++numberOfHumans ;

    }



 //   }





    public void introduce() {
        if(isAlive)
        System.out.println("My name is " + firstName + " " + lastName + ".  I'm " + age + " years old .");
        else
            System.out.println("RIP");
    }
}

