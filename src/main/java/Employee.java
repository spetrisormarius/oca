public class Employee {
    public static void main(String[] args) {

        final String hello = "Hello";

        String hello2 = hello;


        try {
            throw new Exception("ex");
        } catch(Exception ex) {
            System.out.println("ex");
            return;
        } finally {
            System.out.println("finally");
        }


    }
}
