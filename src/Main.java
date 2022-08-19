public class Main {

    public static void main(String[] args) {

        System.out.print("Hello\nworld!\n");  //ето однострочный коментарий
        System.out.println("Hello,World");
        sayHallo();
        calculateArea();
    }

    public static void sayHallo() {
        System.out.println("My town is FFM");
    }

    public static void calculateArea() {
        System.out.println("area:" + 10 * 20);
    }
}
