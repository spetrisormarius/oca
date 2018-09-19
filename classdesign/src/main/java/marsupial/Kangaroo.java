package marsupial;

public class Kangaroo extends Marsupial {

    public static boolean isBiped = false;

    public boolean isQudruped = true;

    public static boolean isBiped() {
        return isBiped;
    }

    public boolean isQudruped() {
        return false;
    }

    public void getKangarooDescription() {
        System.out.println("marsupial.Kangaroo hops on two legs: "+isBiped()); // no polymorphism for static function (hidden)
    }

    public static void main(String[] args) {
        Kangaroo joey = new Kangaroo();
        joey.getMarsupialDescription();
        joey.getKangarooDescription();

        System.out.println(Kangaroo.isBiped);
        System.out.println(Marsupial.isBiped);

    }
}
