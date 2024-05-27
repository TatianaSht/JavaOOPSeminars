package Moiseev.seminar_07.adapter;

public interface SensorTemperature {

    //идентификатор датчика
    int identifier();

    //температура датчика
    double temperature();

    //год
    int year();

    //день года
    int day();

    //секунда дня
    int second();
}
