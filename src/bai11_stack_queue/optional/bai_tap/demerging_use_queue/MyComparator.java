package bai11_stack_queue.optional.bai_tap.demerging_use_queue;

import java.util.Comparator;

public class MyComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if( o1.getName().compareTo(o2.getName())==0){
            return o1.getAge()-o2.getAge();
        }
        return o1.getName().compareTo(o2.getName());
    }
}