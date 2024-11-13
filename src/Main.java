//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import animal.Animal;
import animal.Chicken;
import animal.Tiger;
import Edible.Edible;

public class Main {
    public static void main(String[] args) {
            Animal[] animals = new Animal[2];
            animals[0] = new Tiger();
            animals[1] = new Chicken();
            for (Animal animal : animals) {
                System.out.println(animal.makeSound());

                if (animal instanceof Chicken) {
                    Edible Edibler = (Chicken) animal;
                    System.out.println(Edibler.howToEat());
                }
            }
    }
}