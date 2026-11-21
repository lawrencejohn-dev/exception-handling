package rethrowingexceptions1120;

public class Main {

    public static void main(String[] args) {
        try {
            someMethod();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void someMethod() throws Exception{
        try {
            someMethod2();
        } catch (Exception e) {
            throw e;
        }
    }

    private static void someMethod2() throws Exception {
        throw new Exception("An exception happened");
    }
}
