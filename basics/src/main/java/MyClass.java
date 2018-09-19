import java.util.ArrayList;
import java.util.Date; // takes precedence
import java.sql.*; // The compiler figures out what’s actually needed. not all are imported

// package wildcarsd are not recursive

//import java.util.*;
//import java.sql.*; // DOES NOT COMPILE

import java.lang.System; //reduntant
import java.lang.*;
import java.util.List;


public class MyClass {
    /*
Multi-line comments with
special characters &%^*{}|\|:;"'
?/>.<,!@#$%^&*()
*/
    static String a;

    Date date;

    Date date1;
    int $;

    int _;
    int __$__;

    private boolean isPrivate;

    public static void main(String[] main) {
        //SecondClass t = new SecondClass();
        //FIRSTClass firstClass;

        System.out.println(a);

        String one = "a";
        String two = "b";

        one = two;

        String three = one;

        one = null;

        System.gc();

        MyClass myClass = new MyClass();

        myClass.isPrivate = true;

        //byte alpha = 0xff;

        short alpa = 0xff;
        double kapa = 0xFF;
        double beta = 045;
        float gama = 0xff;
        long sigma = 0xff;

        //literals
        // int default
        // double default
        // f for float l for long

    }


    private static List objects = new ArrayList();
    protected void finalize() { // runs zero or 1 time.
        objects.add(this); // Don't do this
        //when runs one time and it is aborted due to static.
        // does not runs anymore when static is null
    }


    public int notValid() {
         int y = 10;
         int x;
         //int reply = x + y; // DOES NOT COMPILE
         return 9;
    }


    public void findAnswer(boolean check) {
        int answer;
        int onlyOneBranch;
        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }
        System.out.println(answer);
        //System.out.println(onlyOneBranch); // DOES NOT COMPILE
    }


    public void eatIfHungry(boolean hungry) {

        if (hungry) {

            int bitesOfCheese = 1;

        } // bitesOfCheese goes out of scope here

        //System.out.println(bitesOfCheese);// DOES NOT COMPILE
    }
}
