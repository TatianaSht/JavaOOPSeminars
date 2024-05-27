package Obrezumov.seminar_04;

import Moiseev.seminar_04.view.StudentView;

import java.util.List;

public class StudentController implements UserController<Student>{

    private final StudentGroupService studentGroupService = new StudentGroupService();

    private final StudentView studentView = new StudentView();

    public void removeStudentByFIO(String firstName, String lastName, String middleName) {
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }


//    public List<Student> getSortedStudentList() {
//        List<Student> studentList = studentGroupService.getSortedStudentList();
//        studentView.sendOnConsole(studentList);
//        return studentList;
//    }


//    public List<Student> getSortedStudentByFIO() {
//        List<Student> studentList = new studentGroupService.getSortedStudentByFIO();
//        studentView.sendOnConsole(studentList);
//        return studentList;
//    }

    @Override
    public void create(String firstName, String lastName, String middleName) {
        studentGroupService.createStudent(firstName, lastName, middleName);
    }
}
