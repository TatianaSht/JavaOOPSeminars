package Moiseev.seminar_04;

import Moiseev.seminar_04.controller.StudentController;
import Moiseev.seminar_04.data.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.create("1", "135", "1");
        studentController.create("2", "124", "2");
        studentController.create("3", "3", "3");
        studentController.create("4", "4", "4");
        studentController.printAllStudent();

//        Student student1 = new Student("1", "135", "1", 1);
//        Student student2 = new Student("2", "124", "2", 2);
//        Student student3 = new Student("3", "3", "3", 3);
//        Student student4 = new Student("4", "4", "4", 4);
        //Teacher teacher = new Teacher("t", "t", "t", 5);
//        List<Student> list = new ArrayList<>();
//        list.add(student3);
//        list.add(student1);
//        list.add(student4);
//        list.add(student2);
//        list.sort(new UserComparator<Student>());
//        //Collections.sort(list);
//        StudentGroup studentGroup = new StudentGroup(list, teacher);
//        //testIterator(studentGroup);
//        for (Student student : studentGroup) {
//            System.out.println(student);
//        }
    }

//    public static void testIterator(StudentGroup studentGroup){
//        StudentGroupIterator groupIterator = new StudentGroupIterator(studentGroup);
//        while (groupIterator.hasNext()){
//            Student student = groupIterator.next();
//            System.out.println(student);
//            if(student.getStudentId() == 3){
//                groupIterator.remove();
//            }
//        }
//        groupIterator.zeroCounter();
//        while (groupIterator.hasNext()){
//            System.out.println(groupIterator.next());
//        }
//    }
}
