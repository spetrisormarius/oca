import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Koala k = new Koala();
        System.out.println(k.count); // k is a Koala
        k = null;
        System.out.println(k.count); // k is still a Koala

        fly( new int[]{});
        fly( 1, 2, 3);

        int[] as = new int[]{};


        List<String> list = new ArrayList<>();
        list.removeIf( s -> {return s.isEmpty();} );
        list.removeIf( s -> s.isEmpty() );
        //list.removeIf( s -> { s.isEmpty();} );
        //list.removeIf( s -> { String s = ""; s.isEmpty();} );
        list.removeIf( (String s) ->  s.isEmpty() );
        list.removeIf( (s) ->  s.isEmpty() );
        list.removeIf( (String s) -> s.isEmpty());


    }

    //void public walk3() {} // DOES NOT COMPILE
    //public void final walk6() {} // DOES NOT COMPILE
    final public void walk7() {}

//    public String walk4() { } // DOES NOT COMPILE
//    public walk5() { } // DOES NOT COMPILE
//    String walk6(int a) { if (a == 4) return ""; } // DOES NOT COMPILE
    //public void walk3(int... nums, int start) { } // DOES NOT COMPILE
    //public void walk4(int... start, int... nums) { } // DOES NOT COMPILE


//    public void fly(int numMiles) { }
//    public int fly(int numMiles) { } // DOES NOT COMPILE

//    public void fly(int[] lengths) { }
    public static void fly(int... lengths) { } // DOES NOT COMPILE

}
