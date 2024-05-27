package Aktibaev.seminar_02.zoo;

import java.util.List;

public class NoiseZoo {
    private List<Animal> animals;

    public NoiseZoo(List<Animal> animals) {
        this.animals = animals;

    }

    public void speakAll() {
        for (Animal animal: animals) {
            animal.speak();
        }

    }
}
