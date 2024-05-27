package Moiseev.seminar_07.adapter;

import java.time.LocalDateTime;

public class AdapterST500Info implements MeteoSensor{

    SensorTemperature adapter;

    public AdapterST500Info(SensorTemperature adapter){
        this.adapter = adapter;
    }


    @Override
    public int getId() {
        return adapter.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float)adapter.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime dateTime = LocalDateTime.of(adapter.year(), 1, 1, 0, 0);
        dateTime = dateTime.plusDays(adapter.day() - 1);
        dateTime = dateTime.plusSeconds(adapter.second());
        return dateTime;
    }
}
