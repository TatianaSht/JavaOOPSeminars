package Moiseev.seminar_06.LSP;

public class Rectangle extends QuadRangle{

    private int witdh;
    private int height;


    public Rectangle(int witdh, int height) {
        this.witdh = witdh;
        this.height = height;
    }

    @Override
    public double area() {
        return height * witdh;
    }
}
