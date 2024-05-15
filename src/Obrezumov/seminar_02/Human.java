package Obrezumov.seminar_02;

public class Human extends Actor {

    public Human(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder; 
    }

    @Override
    public void takeMakeOrder(boolean takeOrder) {
        super.isTakeOrder = takeOrder;
    }
    
}
