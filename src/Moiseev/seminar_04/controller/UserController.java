package Moiseev.seminar_04.controller;

import Moiseev.seminar_04.data.User;

public interface UserController<T extends User> {
    void create(String firstName, String secondName, String lastName);
}
