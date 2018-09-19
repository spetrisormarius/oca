
public class Main {

    public static void main(String[] args) {

        //int x = 2 * 5 + 3 * 4 - 8;

        System.out.print(11 / 3); // Outputs 3
        System.out.print(11 % 3); // Outputs 2


//        int x = 3;
//        int y = ++x * 5 / x-- + --x;
//        System.out.println("x is " + x);
//        System.out.println("y is " + y);
//



//        int x = 1.0; // DOES NOT COMPILE
//        short y = 1921222; // DOES NOT COMPILE
//        int z = 9f; // DOES NOT COMPILE
//        long t = 192301398193810323; // DOES NOT COMPILE
//
//        int x = (int)1.0;
//        short y = (short)1921222; // Stored as 20678


//        long x = 10;
//        int y = 5;
//        y = y * x; // DOES NOT COMPILE

//        long x = 10;
//        int y = 5;
//        y *= x;   //with implicit cast !!!

//        long x = 5;
//        long y = (x=3);
//        System.out.println(x); // Outputs 3
//        System.out.println(y); // Also, outputs 3


//        int x = 10, y = 20, z = 10;
//        System.out.println(x < x); // Outputs false
//        System.out.println(x < y); // Outputs true
//        System.out.println(x <= y); // Outputs true
//        System.out.println(x >= z); // Outputs true
//        System.out.println(x > z); // Outputs false


//        boolean x = true ^ true; //false
//        boolean x = false ^ false; //false

//
//        if(x != null & x.getValue() < 5) { // Throws an exception if x is null
//        // Do something
//        }


//        boolean x = true == 3; // DOES NOT COMPILE
//        boolean y = false != "Giraffe"; // DOES NOT COMPILE
//        boolean z = 3 == "Kangaroo"; // DOES NOT COMPILE

//        System.out.println((y > 5) ? 21 : "Zebra");
//        int animal = (y < 91) ? 9 : "Horse"; // DOES NOT COMPILE


        //switch and final examples ?
        int dayOfWeek = 5;
        switch(dayOfWeek) {
            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday");
            case 6:
                System.out.println("Saturday");
                break;
        }

//        int x = 0;
//        while(x > 10) {
//            x--;
//        }
//
//        do {
//            x++;
//        } while(false); // semicolon req
//
//        if(x > 10) {  // emulate while
//            do {
//                x--;
//            } while(x > 10);
//        }



//        for( ; ; ) {
//            System.out.println("Hello World");
//        }


//        int x = 0;
//        for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) { // DOES NOT COMPILE
//            System.out.print(x + " ");
//        }

//        for(long y = 0, int x = 4; x < 5 && y<10; x++, y++) { // DOES NOT COMPILE
//            System.out.print(x + " ");
//        }


//        if ( 0 < 0)  System.out.println();
//
//        java.util.List<String> names = new java.util.ArrayList<String>();
//        names.add("Lisa");
//        names.add("Kevin");
//        names.add("Roger");
//        for(Integer i=0; i<names.size(); i++) {
//            String name = names.get(i);
//            if(i>0) {
//                System.out.print(", ");
//            }
//            System.out.print(name);
//        }


        for(int i=0; i<10 ; ) {
            i = i++;
            System.out.println("Hello World");
        }

//        do {
//            int y = 1;
//        } while ( y < 10);  // out of scope


    }


    private int getSortOrder(String firstName, final String lastName) {
        String middleName = "Patricia";
        final String suffix = "JR";
        int id = 0;
        switch(firstName) {
            case "Test":
                return 52;
//            case middleName: // DOES NOT COMPILE
//                id = 5;
//                break;
            case suffix:
                id = 0;
                break;
//            case lastName: // DOES NOT COMPILE
//                id = 8;
//                break;
//            case 5: // DOES NOT COMPILE
//                id = 7;
//                break;
//            case 'J': // DOES NOT COMPILE
//                id = 10;
//                break;
//            case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE
//                id=15;
//                break;
        }
        return id;
    }

}
