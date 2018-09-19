package Bird;

import Bird.Bird;

public class Eagle extends Bird {
    public int fly(int height) {
        System.out.println("Bird.Bird is flying at "+height+" meters");
        return height;
    }
//    public int eat(int food) { // DOES NOT COMPILE
//        System.out.println("Bird.Bird is eating "+food+" units of food");
//        return food;
//    }
}
