public class Dog extends Pet{
    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void species(String color) {
        if (color.equals("Black")) {
            System.out.println("This is black dog");
        } else if (color.equals("Grey")) {
            System.out.println("This is grey dog");
        } else if(color.equals("Brown")) {
            System.out.println("This is brown dog");
        }
    }
}
