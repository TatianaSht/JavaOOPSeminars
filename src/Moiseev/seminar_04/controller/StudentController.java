package Moiseev.seminar_04.controller;

import Moiseev.seminar_04.data.Student;
import Moiseev.seminar_04.service.StudentService;
import Moiseev.seminar_04.view.StudentView;

import java.util.List;

public class StudentController implements UserController{
    private final StudentService studentService = new StudentService();
    private final StudentView studentView = new StudentView();

    @Override
    public void create(String firstName, String secondName, String lastName) {
        studentService.create(firstName, secondName, lastName);
    }

    public List<Student> getAllStudents(){
        return studentService.getAll();
    }

    public void printAllStudent(){
        studentView.sendOnConsole(getAllStudents());
    }
}
