package Moiseev.seminar_02;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Test1");
        Human human2 = new Human("Test2");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();
    }
}
