package Obrezumov.seminar_07.adapter;

public interface SensorTemperature {
    int identifier(); // идентификатор датчика
    Float temperature(); // температура датчика
    int year();			 // Год
    int day();			 // День года
    int second();		 // Секунда дня
}
