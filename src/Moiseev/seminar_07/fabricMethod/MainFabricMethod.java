package Moiseev.seminar_07.fabricMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MainFabricMethod {
    public static void main(String[] args) {

        List<ItemGen> generator = new ArrayList<>();
        generator.add(new GoldGen());
        generator.add(new GemGen());

        Random rnd = ThreadLocalRandom.current();
        for (int i = 0;  i < 10; i++){
            IGameItem item = generator.get(Integer.parseInt(String.valueOf(Math.abs(rnd.nextInt() % generator.size())))).createItem();
            item.open();
        }
    }
}
