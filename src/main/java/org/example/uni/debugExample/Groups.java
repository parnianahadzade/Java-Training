package org.example.uni.debugExample;

import java.util.ArrayList;
import java.util.List;

public class Groups {
    public static void main(String[] args) throws InterruptedException {
        List<Student> students = createStudents();
        outputValues(students);
//        Thread.sleep(10000); // Sleeps for 10 seconds

        Student student = new Student("g","h");

        for (int i = 0; i <100 ; i++) {
            System.out.println("salam");
        }
    }

    public static void outputValues(List<Student> students){
        System.out.println("Output values : ");
        for(Student student : students){
            System.out.println(student);
        }
    }

    public static List<Student> createStudents() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("a","b"));
        students.add(new Student("c","d"));
        students.add(new Student("e","f"));
        return students;
    }
}
