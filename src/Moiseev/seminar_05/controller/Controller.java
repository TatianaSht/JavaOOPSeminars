package Moiseev.seminar_05.controller;

import Moiseev.seminar_05.model.Student;
import Moiseev.seminar_05.model.Type;
import Moiseev.seminar_05.model.User;
import Moiseev.seminar_05.service.DataService;
import Moiseev.seminar_05.view.StudentView;

import java.util.List;

public class Controller {

    private final DataService dataService = new DataService();
    private final StudentView studentView = new StudentView();


    public void createStudent(String firstName, String secondName, String lastName){
        dataService.create(firstName, secondName, lastName, Type.STUDENT);
    }


//    public void createTeacher(String firstName, String secondName, String lastName){
//        dataService.create(firstName, secondName, lastName, Type.TEACHER);
//    }


    public void getAllStudent(){
        List<User> userList = dataService.getAllStudent();
        for (User user : userList){
            studentView.printOnConsole((Student) user);
        }
    }
}
