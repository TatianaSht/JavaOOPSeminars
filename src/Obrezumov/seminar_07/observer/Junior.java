package Obrezumov.seminar_07.observer;

import java.util.Random;

public class Junior implements Observer{

    private String name;

    public Junior(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (new Random().nextBoolean()){
            System.out.println("Junior accept the offer! Company, salary: " + nameCompany + ", " + salary + "Junior name: " + name);
        } else {
            System.out.println("Junior dont accept the offer! Company, salary: " + nameCompany + ", " + salary + "Junior name: " + name);
        }
    }
}
