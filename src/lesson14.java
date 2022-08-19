public class lesson14 {
    // Статические переменные и методы класса описывают класс а не какой
    // конкретный обект етого класа
    // Таким образом статистические переменые и методы принадлежат классу в целом
    // а не в каком то конкретному обьекту (екземпляр, instance)
    // обьект == екземпляр == instance
    public static void main(String[] args) {
       // Lesson14 lesson14 = new lesson14();
      //  lesson14.max.introduce();

        HomoSapiens katya = new HomoSapiens("Katya","Ivanova",30);
        katya.introduce();
        HomoSapiens max = new HomoSapiens("Max", "Kotkov", 30);
        max.introduce();
       // HomoSapiens.introduce();

        HomoSapiens vasya = new HomoSapiens("Vasya", " ", 30);
        vasya.introduce();
      //  vasya.lastName = "Pivovarov";
        vasya.introduce();
        vasya.setLastName("Petrov");
        vasya.introduce();
       // vasya.getLastName();
       // vasya.introduce();
        System.out.println(HomoSapiens.numberOfHumans);
        System.out.println(HomoSapiens.averageAge);
    }


   //HomoSapiens max = new HomoSapiens("Max", "Kotkov", 29);

}
    class HomoSapiens {

    public static int numberOfHumans = 0;


      private String lastName;

        public String getLastName() {   //
            return lastName;
        }
        void setLastName(String lastName){
            this.lastName=lastName;
        }

        String firstName;
        int age;

        public HomoSapiens()
        {
            /*
            (averageAge*N + age)/(N+1)

             */
            this("","",0);

          //  averageAge = (averageAge*numberOfHumans +age)/(numberOfHumans +1);
         //   numberOfHumans++;

        }

        public HomoSapiens(String firstName, String lastName) {
           // this();
          //  this.firstName = firstName;
           // this.lastName = lastName;
            this(firstName,lastName,0);

        }


        public HomoSapiens(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;

            averageAge = (averageAge*numberOfHumans +age)/++numberOfHumans ;

        }

        public static int averageAge =0;

        public void introduce() {
            System.out.println("My name is " + firstName + " " + lastName + ".  I'm " + age + " years old .");
        }
    }
