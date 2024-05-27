package Moiseev.seminar_07.decorator;

public class MainDecorator {
    public static void main(String[] args) {


        //переменная одна, но ей динамически меняется реализация

        // просто пицца
        Pizza pizzaCheese1 = new PizzaDough();
        System.out.println(pizzaCheese1.getDescription() + ": " + pizzaCheese1.getCost() + "р");

        //пицца и сыр
        Pizza pizzaCheese2 = new CheeseDecorator (new PizzaDough());
        System.out.println(pizzaCheese2.getDescription() + ": " + pizzaCheese2.getCost() + "р");

        //пицца и два сыра
        Pizza pizzaCheese3 = new CheeseDecorator (new CheeseDecorator (new PizzaDough()));
        System.out.println(pizzaCheese3.getDescription() + ": " + pizzaCheese3.getCost() + "р");
    }
}
