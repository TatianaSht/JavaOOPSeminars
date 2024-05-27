package Moiseev.seminar_07.fabricMethod;

public class GemGen extends ItemGen{

    @Override
    public IGameItem createItem() {
        return new GemReward();
    }
}
