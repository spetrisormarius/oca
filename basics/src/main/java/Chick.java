public class Chick {

 // { System.out.println(name); } // DOES NOT COMPILE  - order maters

 private String name = "Fluffy";

 { System.out.println("setting field"); }

 public Chick() {
   name = "Tiny";
   System.out.println("setting constructor");
 }

 public static void main(String[] args) {

    Chick chick = new Chick();

    System.out.println(chick.name);

     //long max = 3123456789; // DOES NOT COMPILE

     System.out.println(Integer.MAX_VALUE);
     System.out.println(Byte.MIN_VALUE + ":" +Byte.MAX_VALUE);

     int a = 0xFF;
     int b = 0XFF;
     int c = 0xff;
     //byte d = 0xff; DOES NOT COMPILE
     byte e = 0b10;
     byte q = 015;


     int million2 = 1_000_000;

     //double notAtStart = _1000.00; // DOES NOT COMPILE
     //double notAtEnd = 1000.00_; // DOES NOT COMPILE
     //double notByDecimal = 1000_.00; // DOES NOT COMPILE
     //double annoyingButLegal = 1_00_0.0_0; // this one compiles


     //int value = null; // DOES NOT COMPILE
     String s = null;


     String s1, s2;
     String s3 = "yes", s4 = "no";

     int i1, i2, i3 = 0; // only i3 = 0

     //int num, String value; // DOES NOT COMPILE

 }





}
