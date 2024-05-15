package Obrezumov.seminar_02;

public interface ActorBehaviour {
    void setMakeOrder (boolean makeOrder);
    void takeMakeOrder (boolean takeOrder);

    boolean isMakeOrder();
    boolean isTakeOrder();
}
