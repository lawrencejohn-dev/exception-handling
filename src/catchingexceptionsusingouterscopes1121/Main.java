package catchingexceptionsusingouterscopes1121;

public class Main {

    public static void main(String[] args) {
        try {
            someMethod();
        } catch (Exception e) {
            System.out.println("Main caught the null error");
        }
    }

    public static void someMethod() {
        try {
            int answer = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("someMethod caught the arithmetic error");
        }

        try {
            String name = null;
            System.out.println(name.length());
        } catch (ArithmeticException e) {
            System.out.println("This catch does not handle a null error");
        }
    }
}
