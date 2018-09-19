package marsupial;

public class Marsupial {

    public static boolean isBiped = true;

    private boolean isQudruped = true;

    public static boolean isBiped() {
        return false;
    }

    private boolean isQudruped() {
        return false;
    }

    public void getMarsupialDescription() {
        System.out.println("marsupial.Marsupial walks on two legs: "+isBiped());
    }
}
