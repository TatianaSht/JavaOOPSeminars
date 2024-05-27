package Moiseev.seminar_07.fabricMethod;

public class GoldGen extends ItemGen{

    @Override
    public IGameItem createItem() {
        return new GoldReward();
    }
}
