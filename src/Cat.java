public class Cat extends Pet {
    public Cat(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void species(String color) {
        if (color.equals("Black")) {
            System.out.println("This is black cat");
        } else if (color.equals("Grey")) {
            System.out.println("This is grey cat");
        }
    }
}
