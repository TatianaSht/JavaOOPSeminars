package Moiseev.seminar_07.decorator;

public abstract class PizzaDecorator implements Pizza{

    // переменная Pizza доступна для наследников, но закрыта для доступа извне
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}
