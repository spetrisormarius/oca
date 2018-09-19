import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    static char c;

    public static void main(String[] args) {

        System.out.println("Char c=" + c);

        StringBuilder sb = new StringBuilder("sb");

        System.out.println("String buffer toString:" + sb);

        List list = new ArrayList();

        list.add( null );

        list.remove( null);
        int a = list.indexOf(null);

        System.out.println(a);

        String trim1 = " stri ng ";

        trim1.trim();

        int indexTrim = trim1.indexOf(" ");

        System.out.println(indexTrim);


        String  str[][] = new String[1][3];

        System.out.println(str);
        System.out.println(str[0]);

        for ( int i = 0;  i < str.length; i++ ) {
            for ( int j = 0;  j < str[i].length; j++ ) {
              System.out.println(str[i][j]);

            }
        }
//
//        int[] vec = new int[10];
//
//        for ( int i : vec ) {
//            System.out.println(i);
//        }

        float f = 100;
        double d = 100.0;

        //f = d;
        f = (float)d;

        System.out.println("float f =" + f);

        Base b1 = new Base();
        Base b11 = new Base();
        DerivedA b2 = new DerivedA();

        DerivedB b3 = new DerivedB();

        b1 = b3;

        b2 = (DerivedA)b1;

        //b2 = (DerivedA)b3;


        int k1 = 104;
        int k2  = 103;
        int k3 = 102;

        int res = k1 < k2 ? k2 < k3 ?  k1 : k2 < k1 ? k1 : k2 : k3;

        System.out.println(res);

        b1.a++;
        b11.a++;

        System.out.println(b1.a);

         LocalDateTime time =  LocalDateTime.of(2014, 7, 31, 1,1);

         LocalDate time1 = LocalDate.now();

        System.out.println(time1 +  time.format(DateTimeFormatter.ISO_DATE) );

        String str1 = "Hello";

        str1.substring( 3, 5 );

        String [] strArr = {"H", "e", "l", "l", "o"};

        String str2="";

        for (String str3: strArr) {
            str2+=str3;
        }

        boolean res1 = str1.equals(str2);

        System.out.println( "Test" + 1 + 2 + res1);
        System.out.println( "Test" + (1) + (2) );

        String appendCh= "";
        for (char ch ='0'; ch <= 'z' ; ch++ ) {
            appendCh+=ch;
        }
        System.out.println( appendCh );

//        str2.replaceAll();
//        str2.replace();

        StringBuilder sb1 = new StringBuilder();

//        sb1.replace()
//        sb1.delete()

        sb = new StringBuilder("animals");

//        sb.insert(7, "-"); // sb = animals—
//        sb.insert(0, "-"); // sb = -animals—
//        sb.insert(4, "-"); // sb = -animals
        StringBuilder sb3 = new StringBuilder("animals");

        boolean res2 = sb.equals(sb3); // equals not implemented


        System.out.println("" + sb + res2);

        List<String> someStrings = Arrays.asList("a", "b");
        for (String s : Reversed.reversed(someStrings)) {
            System.out.println("" + s);
        }


        int []  array1 = {1, 2, 3, 4};
        int []  array2 = {1, 2, 3, 4};

        Integer []  array3 = {1, 2, 3, 4};
        Integer []  array4 = {1, 2, 3, 4};

        boolean arrayTest = array1.equals(array2);

        boolean arrayTest1 = array3.equals(array4);

        boolean arrayTest3 = Arrays.equals( array1, array2);

        boolean arrayTest4 = Arrays.equals( array3, array4);

        Arrays.toString(array1);

    }
}
