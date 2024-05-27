package Moiseev.seminar_07.fabricMethod;

public class GoldReward implements IGameItem{

    @Override
    public void open() {
        System.out.println("Открыли сундук с золотом");
    }
}
