package catchingexceptionswithsuperclasses1116;

public class Main {

    public static void testException(int choice) {
        try{
            if(choice == 1) {
                throw new ExceptionA("This is ExceptionA");
            }
            else if(choice == 2) {
                throw new ExceptionB("This is ExceptionB");
            }
            else {
                throw new ExceptionC("This is ExceptionC");
            }
        } catch (ExceptionA e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        testException(1);
        testException(2);
        testException(3);
    }
}
