package bai7_abstract_class_interface.thuc_hanh.animal_va_interface_edible;

import bai7_abstract_class_interface.thuc_hanh.animal_va_interface_edible.animal.Animal;
import bai7_abstract_class_interface.thuc_hanh.animal_va_interface_edible.animal.Chicken;
import bai7_abstract_class_interface.thuc_hanh.animal_va_interface_edible.animal.Tiger;
import bai7_abstract_class_interface.thuc_hanh.animal_va_interface_edible.fruit.Apple;
import bai7_abstract_class_interface.thuc_hanh.animal_va_interface_edible.fruit.Fruit;
import bai7_abstract_class_interface.thuc_hanh.animal_va_interface_edible.fruit.Orange;

public class AbstractAndInterfaceTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals){
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken){
                System.out.println(((Chicken)animal).howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }
    }
}