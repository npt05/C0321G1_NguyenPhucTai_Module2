package bai11_stack_queue.optional.bai_tap.demerging_use_queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Duc", 20, "nam"));
        students.add(new Student("Hai", 19, "nam"));
        students.add(new Student("Hoa", 21, "nu"));
        students.add(new Student("Vinh", 18, "nam"));
        students.add(new Student("Yen", 19, "nu"));
        students.add(new Student("Tu", 20, "nu"));
        students.add(new Student("Nam", 21, "nam"));

        Collections.sort(students);
        System.out.println("Sắp xếp theo tuôi");
        for (Student student : students) {
            System.out.println(student);
        }


        Queue<Student> nu=new LinkedList<>();
        Queue<Student> nam=new LinkedList<>();
        ArrayList<Student> list=new ArrayList<>();


        for(Student student :students){
            if(student.getGender().equals("nu")){
                nu.add(student);
            }else {
                nam.add(student);
            }
        }

        while (!nu.isEmpty()){
            list.add(nu.poll());
        }

        while (!nam.isEmpty()){
            list.add(nam.poll());
        }

        System.out.println("List sinh vien sau khi sap xep nu len truoc");
        for(Student student : list){
            System.out.println(student);
        }

    }
}