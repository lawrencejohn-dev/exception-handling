package customexceptionclass1119;

public class Main {

    public static void main(String[] args) {
        try {
            Phone myPhone = new Phone("Lawrence phone", "1234567890123456");
            myPhone.displayDetails();
        } catch (ValidationException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
