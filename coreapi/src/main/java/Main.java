import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(1 + 2); // 3
        System.out.println("a" + "b"); // ab
        System.out.println("a" + "b" + 3); // ab3
        System.out.println(1 + 2 + "c"); // 3c  - evaluate left to right


        String s = "1"; // s currently holds "1"
        s += "2"; // s currently holds "12"
        s += 3; // s currently holds "123"
        System.out.println(s); // 123


        //if ( int a = 2)
        boolean b = true;
        if ( b = true );

        int i = 1;
        //if ( i = (boolean)3 );
//
//        long k = 0;
//        int a;
//        int l;

        //for (k = 2,  a =4 ;;);


        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        System.out.println(s2);
        //Did you say "12"? Good.

//        String string = "animals";
//        System.out.println(string.charAt(0)); // a
//        System.out.println(string.charAt(6)); // s
//        System.out.println(string.charAt(7)); // throws exception

//        String string = "animals";
//        System.out.println(string.indexOf('a')); // 0
//        System.out.println(string.indexOf("al")); // 4
//        System.out.println(string.indexOf('a', 4)); // 4
//        System.out.println(string.indexOf("al", 5)); // -1


//        String string = "animals";
//        System.out.println(string.substring(3)); // mals
//        System.out.println(string.substring(string.indexOf('m'))); // mals
//        System.out.println(string.substring(3, 4)); // m
//        System.out.println(string.substring(3, 7)); // mals
//
//        System.out.println(string.substring(3, 3)); // empty string
//        System.out.println(string.substring(3, 2)); // throws exception
//        System.out.println(string.substring(3, 8)); // throws exception
//
//        System.out.println("abc".contains("b")); // true
//        System.out.println("abc".contains("B")); // false
//
//
//        StringBuilder sb = new StringBuilder().append(1).append('c');
//        sb.append("-").append(true);
//        System.out.println(sb); // 1c-true


//        StringBuilder sb = new StringBuilder("animals");
//        sb.insert(7, "-"); // sb = animals-
//        sb.insert(0, "-"); // sb = -animals-
//        sb.insert(4, "-"); // sb = -ani-mals
//        System.out.println(sb);


//        StringBuilder sb = new StringBuilder("abcdef");
//        sb.delete(1, 3); // sb = adef
//        sb.deleteCharAt(5); // throws an exception

//        StringBuilder sb = new StringBuilder("abcdef");
//        sb.delete(1, 3); // sb = adef
//        sb.deleteCharAt(5); // throws an exception
//
//        String x = "Hello World";
//        String y = "Hello World";
//        System.out.println(x == y); // true

//        String x = "Hello World";
//        String z = " Hello World".trim();
//        System.out.println(x == z); // false


//        String x = new String("Hello World");
//        String y = "Hello World";
//        System.out.println(x == y); // false


        String x = "Hello World";
        String z = " Hello World".trim();
        System.out.println(x.equals(z)); // true

        Book b1 = new Book("1234-4657");
        Book b2 = new Book("1234-4657");
        System.out.print(b1.equals(b2) +":");
        System.out.print(b1.ISBN.equals(b2.ISBN) +":");
        System.out.println(b1 == b2);

        int[] numbers = {2,4,6,8};
        System.out.println(Arrays.binarySearch(numbers, 2)); // 0
        System.out.println(Arrays.binarySearch(numbers, 4)); // 1
        System.out.println(Arrays.binarySearch(numbers, 1)); // -1
        System.out.println(Arrays.binarySearch(numbers, 3)); // -2
        System.out.println(Arrays.binarySearch(numbers, 9)); // -5

        int[][] vars1; // 2D array
        int vars2 [][]; // 2D array
        int[] vars3[]; // 2D array
        int[] vars4 [], space [][]; // a 2D AND a 3D array

        int[][] differentSize = {{1, 4}, {3}, {9,8,7}};

//        int [][] args = new int[4][];
//        args[0] = new int[5];
//        args[1] = new int[3];

        int[][] twoD = new int[3][2];

        for (int[] inner : twoD) {
            for (int num : inner)
                System.out.print(num + " ");
            System.out.println();
        }



//        List<Integer> heights = new ArrayList<>();
//        heights.add(null);
//        int h = heights.get(0); // NullPointerException


//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.remove(1);  - autoboxing on override methods. pick specific
//        System.out.println(numbers);


//        String[] array = { "hawk", "robin" }; // [hawk, robin]
//        List<String> list = Arrays.asList(array); // returns fixed size list
//        System.out.println(list.size()); // 2
//        list.set(1, "test"); // [hawk, test]
//        array[0] = "new"; // [new, test]
//        for (String bo : array) System.out.print(bo + " "); // new test
//        list.remove(1); // throws UnsupportedOperation Exception

        //List<String> list = Arrays.asList("one", "two");

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        //LocalDate d = new LocalDate(); // DOES NOT COMPILE

//        LocalDate.of(2015, Month.JANUARY, 32); // throws DateTimeException
//        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
//        LocalTime time = LocalTime.of(5, 15);
//        LocalDate date2 = null;
//        LocalDateTime dateTime = LocalDateTime.of(date2, time)
//                .minusDays(1).minusHours(10).minusSeconds(30);


        //LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        //date = date.plusMinutes(1); // DOES NOT COMPILE

        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        Period period = Period.ofMonths(1); // create a period

        Period everyYearAndAWeek = Period.of(1, 0, 7); // every year and 7 days

        Period wrong = Period.ofYears(1).ofWeeks(1); // every week


//        LocalDate date = LocalDate.of(2015, 1, 20);
//        LocalTime time = LocalTime.of(6, 15);
//        LocalDateTime dateTime = LocalDateTime.of(date, time);
//        Period period = Period.ofMonths(1);
//        System.out.println(date.plus(period)); // 2015-02-20
//        System.out.println(dateTime.plus(period)); // 2015-02-20T06:15
//        System.out.println(time.plus(period)); // UnsupportedTemporalTypeException

//        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
//        LocalTime time = LocalTime.of(11, 12, 34);
//        LocalDateTime dateTime = LocalDateTime.of(date, time);System.out.println(date
//                .format(DateTimeFormatter.ISO_LOCAL_DATE));
//        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
//        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

//        DateTimeFormatter shortDateTime =
//                DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
//        System.out.println(shortDateTime.format(dateTime)); // 1/20/20
//        System.out.println(shortDateTime.format(date)); // 1/20/20
//        System.out.println(
//                shortDateTime.format(time)); // UnsupportedTemporalTypeException
//
//        DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm");
//        f.format(dateTime);
//        f.format(date);
//        f.format(time);

//        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
//        LocalDate date = LocalDate.parse("01 02 2015", f);
//        LocalTime time = LocalTime.parse("11:22");
//        System.out.println(date); // 2015-01-02
//        System.out.println(time); // 11:22


//        StringBuilder sb1 = new StringBuilder("test");
//
//        sb1.substring(1);
//
//        System.out.println(sb1);

//
//        String roar1 = "roar";
//        StringBuilder roar2 = new StringBuilder("roar");
//        Date date = new Date();
//        Integer c = 1;
//        int [] arr = new int[1];
//        List<String> lit = new ArrayList<>();
//        boolean  b12 = true;

//        String aconcatentte = roar1 + " " + c + roar2 + b12 + 'c' + 9L + date;
//        System.out.println(roar1 + " " + c + roar2 + b12 + 'c' + 9L + date + arr + lit);
//
//        Object obj1 = null;
//        Object obj2 = null;
//        Integer ii= 0;
//        Float f = 8f;

        //boolean k = obj1==(obj2);
        //boolean k = f == (String)lit;
        //boolean k = 0 == 8f;

//        Main main = new Main();
//        //Book a = (Book)main;
//        Object obj3 = main;
//
//        Object[][][] cubbies = new Object[3][0][0];
//        int [] a = new int[-1];
//        //a[-1]= 0;
//
//        a[0] = a.length;
//
//        aconcatentte.length();


        int[] a1 = {1};
        int[] a2 = {1};
        int[] a5 = {};

        boolean a3 = a1.equals(a2);


        // fixed size list ---

//        List<String> hex = Arrays.asList("30", "8", "3A", "FF");
//        Collections.sort(hex);
//        int x = Collections.binarySearch(hex, "8");

        boolean a4 = Arrays.equals(a1, a2);

        //autoboxing null
//        List<Integer> ages = new ArrayList<>();
//        ages.add(Integer.parseInt("5"));
//        ages.add(Integer.valueOf("6"));
//        ages.add(7);
//        ages.add(null);
//        for (int age : ages) System.out.print(age);


//        // immmutable date
//        LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
//        date.plusDays(2);
//        date.plusYears(3);
//        System.out.println(date.getYear() + " " + date.getMonth() + " "
//                + date.getDayOfMonth());

//        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
//        Period p = Period.ofDays(1).ofYears(2); // chain not allowed
//        d = d.minus(p);
//        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle
//                .MEDIUM);
//        System.out.println(f.format(d));
//
//        LocalTime time = LocalTime.of(6, 15);
//        Period period1 = Period.ofMonths(1);
//
//        time.plus(period); //exception

        LocalTime time = LocalTime.of(6, 15);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle
                .MEDIUM);
        System.out.println(f.format(time));



    }

    private void test () {
        //if ( int a = 2)
        boolean b = true;
        if ( b = true );

        int i = 1;
        //if ( i = (boolean)3 );

        //long k;
        int a = 2;
        int l;

        //for (long k = 2, a = 1 ;;); - dows not compile


    }

}

class Book {
    String ISBN;
    Book(String val) {
        ISBN = val;
    }
}
