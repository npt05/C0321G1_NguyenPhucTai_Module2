package bai7_abstract_class_interface.thuc_hanh.animalvainterfaceedible.animal;

import bai7_abstract_class_interface.thuc_hanh.animalvainterfaceedible.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String toString() {
        return "Chicken";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
