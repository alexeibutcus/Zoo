import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Map<String, Pet> pets = new HashMap<>();
        pets.put("one", new Cat("Bit", 7, "Black"));
        pets.put("two", new Dog("Chirill", 2, "Brown"));
        pets.put("three", new Parrot("Kesha", 1, "Yellow"));

        System.out.println("Вывод всех животных:");
        for (Map.Entry<String, Pet> i : pets.entrySet()) {
            System.out.println(i);
        }

        System.out.println("\nВывод метода species:");
        for (Map.Entry<String, Pet> i : pets.entrySet()) {
            i.getValue().species(i.getValue().color);
        }

        System.out.println("\nВывод только имени животного:");
        for (Map.Entry<String, Pet> i : pets.entrySet()) {
            System.out.println(i.getValue().getName());
        }
    }
}
