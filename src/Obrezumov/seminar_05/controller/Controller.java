package Obrezumov.seminar_05.controller;

import Obrezumov.seminar_05.view.StudentView;
import Obrezumov.seminar_05.model.Student;
import Obrezumov.seminar_05.model.Type;
import Obrezumov.seminar_05.model.User;
import Obrezumov.seminar_05.service.DataService;

import java.util.List;

public class Controller {

    private final DataService service = new DataService();

    private final StudentView view = new StudentView();


    public void createStudent(String firstName, String lastName, String middleName){
        service.create(firstName, lastName, middleName, Type.STUDENT);
    }


    public void getAllStudent(){
        List<User> userList = service.getAllStudent();
        for (User user : userList){
            Student student = (Student) user;
            view.printOnConsole(student);
        }
    }

}
