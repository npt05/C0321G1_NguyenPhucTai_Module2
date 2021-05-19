package bai7_abstract_class_interface.thuc_hanh.animal_va_interface_edible.animal;

public class Tiger extends Animal {
    @Override
    public String makeSound(){
        return "Tiger: roarrrrrrr!";
    }
    @Override
    public String toString(){
        return "Tiger";
    }


}
