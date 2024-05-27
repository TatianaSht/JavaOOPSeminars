package Moiseev.seminar_06.LSP;

public class Square extends QuadRangle{

    private int len;


    public Square(int len) {
        this.len = len;
    }

    @Override
    public double area() {
        return len * len;
    }
}
