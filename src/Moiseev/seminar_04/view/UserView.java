package Moiseev.seminar_04.view;

import Moiseev.seminar_04.data.User;

import java.util.List;

public interface UserView <T extends User>{
    void sendOnConsole(List<T> list);
}
