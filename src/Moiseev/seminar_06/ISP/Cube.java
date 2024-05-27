package Moiseev.seminar_06.ISP;

public class Cube implements Shape, Shape3D{

    private int len;


    @Override
    public double perimetr() {
        return len * 12;
    }

    @Override
    public double volume() {
        return len * len * len;
    }


}
