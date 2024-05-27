package Moiseev.seminar_05;

import Moiseev.seminar_05.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.createStudent("aaa", "aaa", "aaa");
        controller.createStudent("бббб", "бббб", "бббб");
        controller.createStudent("вв", "ввв", "вв");
        controller.getAllStudent();


    }


}
