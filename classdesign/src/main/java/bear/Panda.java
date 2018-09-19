package bear;

public class Panda extends Bear {
//    public static void eat() {
//        //bear.Bear.eat();
//        System.out.println("bear.Panda bear is chewing");
//    }

    public void eatThis() {
        eat();
    }
    public static void main(String[] args) {
        Panda.eat();

        Bear panda = new Panda();

        panda.eat();
    }

//    public void sneeze() { // DOES NOT COMPILE
//        System.out.println("bear.Panda bear sneezes quietly");
//    }
//    public static void hibernate() { // DOES NOT COMPILE
//        System.out.println("bear.Panda bear is going to sleep");
//    }

}
