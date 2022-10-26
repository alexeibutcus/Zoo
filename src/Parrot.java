public class Parrot extends Pet{
    public Parrot(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void species(String color) {
        if (color.equals("Yellow")) {
            System.out.println("This is yellow parrot");
        } else if (color.equals("Blue")) {
            System.out.println("This is blue parrot");
        } else if(color.equals("Green")) {
            System.out.println("This is green parrot");
        }
    }
}
