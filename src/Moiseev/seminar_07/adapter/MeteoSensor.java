package Moiseev.seminar_07.adapter;

import java.time.LocalDateTime;

public interface MeteoSensor {

    //идентификатор датчика
    int getId();

    //температура датчика
    Float getTemperature();

    //влажность
    Float getHumidity();

    //давление
    Float getPressure();

    //время чтения данных датчика
    LocalDateTime getDateTime();

}
