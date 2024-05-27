package Moiseev.seminar_07.observer;

public class Student implements Observer{

    String name;
    int salary;

    public Student(String name) {
        this.name = name;
        salary = 0;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (this.salary < salary){
            System.out.println(String.format("Student %s: Мне нужна эта работа! (company, salary) = %s, %d", name, nameCompany, salary));
            this.salary = salary;
        }
        else System.out.println(String.format("Student %s: У меня есть работа получше! (company, salary) = %s, %d", name, nameCompany, salary));
    }
}
