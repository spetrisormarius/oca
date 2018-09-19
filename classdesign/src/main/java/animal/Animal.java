package animal;

public abstract class Animal {
    protected int age;
    public void eat() {
        System.out.println("animal.Animal is eating");
    }
    protected abstract String getName();
    //private abstract String getName(); DNC

    int MAXIMUM_DEPTH = 100;
    final static boolean UNDERWATER = true;
    public static final String TYPE = "Submersible";
}
