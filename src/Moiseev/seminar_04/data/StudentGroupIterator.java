package Moiseev.seminar_04.data;

import Moiseev.seminar_04.data.Student;
import Moiseev.seminar_04.data.StudentGroup;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student>{
    private final List<Student> studentList;
    private int counter;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentList = studentGroup.getStudentList();
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < studentList.size();
    }

    public void zeroCounter(){
        counter = 0;
    }

    @Override
    public Student next() {
        //System.out.println(counter);
        if (!hasNext())
            return null;
        //пропуск студента с индексом 2
//        if (studentList.get(counter).getStudentId() == 2){
//            counter++;
//            return next();
//        }
        return studentList.get(counter++);
    }

    @Override
    public void remove() {
        //System.out.println(studentList.get(counter));
        studentList.remove(--counter);
    }
}
