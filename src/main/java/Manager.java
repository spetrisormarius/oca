public class Manager {
    public static void main(String[] args) throws Exception {

        try {
            throw new Exception("ex1");

        } catch (Exception ex) {
          System.out.println(ex);

          try {
              throw new Exception("ex2");

          } finally {
              System.out.println("finally 2");
          }

        } finally {
            System.out.println("finally");
        }

    }
}
