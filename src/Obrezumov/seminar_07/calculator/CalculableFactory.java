package Obrezumov.seminar_07.calculator;

public class CalculableFactory implements ICalculableFactory{
    public Calculable create(int primaryArg) {
        return new Calculator(primaryArg);
    }
}
