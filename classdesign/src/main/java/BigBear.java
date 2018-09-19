public class BigBear  implements Omnivore , Herbivore  {
    public void eatMeat() {
        System.out.println("Eating meat");
    }

    @Override
    public void eatPlants() {  // multiple inheritance same method
        System.out.println("Eating plants");
    }

//    @Override
//    public int eatPlants(int quantity) {
//        return 0;
//    }
}
