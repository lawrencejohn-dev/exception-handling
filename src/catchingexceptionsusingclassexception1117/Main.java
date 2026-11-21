package catchingexceptionsusingclassexception1117;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            throw new ExceptionA("ExceptionA was thrown");
        } catch (ExceptionA exception) {
            System.out.println("Caught:" + exception);
        }

        try {
            throw new ExceptionB("ExceptionB was thrown");
        } catch (ExceptionB exception) {
            System.out.println("Caught: " + exception);
        }

        try {
            throw new NullPointerException("NullPointerException was thrown");
        } catch (NullPointerException exception) {
            System.out.println("Caught: " + exception);
        }

        try {
            throw new IOException("IOException was thrown");
        } catch (IOException exception) {
            System.out.println("Caught: " + exception);
        }
    }
}
