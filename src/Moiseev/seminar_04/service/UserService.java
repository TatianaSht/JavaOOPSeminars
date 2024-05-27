package Moiseev.seminar_04.service;

import Moiseev.seminar_04.data.User;

import java.util.List;

public interface UserService<T extends User> {

    void create(String firstName, String secondName, String lastName);
    List<T> getAll();

}
