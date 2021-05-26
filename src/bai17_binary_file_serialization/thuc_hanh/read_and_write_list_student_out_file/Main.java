package bai17_binary_file_serialization.thuc_hanh.read_and_write_list_student_out_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFile(String path, List<Student> students){
        try {
            FileOutputStream fos=new FileOutputStream(path);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student(1, "Hoàng Văn Long", "Quảng Bình"));
        students.add(new Student(2, "Trần Văn Quân", "Quảng Nam"));
        students.add(new Student(3, "Đặng Thị Mỹ Tú", "Bình Dương"));
        students.add(new Student(4, "Nguyễn Thị Huyền", "Huế"));
        students.add(new Student(5, "Bùi Thị Phương Linh", "Huế"));
        writeToFile("C:/Hoc_lap_trinh/C0321G1_NguyenPhucTai_module2/src/bai17_binary_file_serialization/thuc_hanh/read_and_write_list_student_out_file/student.txt",students);
        List<Student> studentDataFromFile = readDataFromFile("C:/Hoc_lap_trinh/C0321G1_NguyenPhucTai_module2/src/bai17_binary_file_serialization/thuc_hanh/read_and_write_list_student_out_file/student.txt");
        for (Student student : studentDataFromFile){
            System.out.println(student);
        }
    }
    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return students;
    }
}
