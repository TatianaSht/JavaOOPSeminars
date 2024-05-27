package Moiseev.seminar_06;

import Moiseev.seminar_06.DIP.DieselEngine;
import Moiseev.seminar_06.DIP.PatrolEngine;
import Moiseev.seminar_06.OCP.Bus;
//import Moiseev.seminar_06.OCP.Car;
import Moiseev.seminar_06.DIP.Car;
import Moiseev.seminar_06.OCP.Vehicle;
import Moiseev.seminar_06.SRP.Employee;
import Moiseev.seminar_06.SRP.EmployeeSalaryCalculate;

public class Main {
    public static void main(String[] args) {

//        testSRP();
//        testOCP(new Vehicle(100, "Vehicle"));
//        testOCP(new Car(200));
//        testOCP(new Bus(200));
        testDIP();

    }

    static void testSRP(){
        Employee employee = new Employee("Test", "qwerty");
        //...
        EmployeeSalaryCalculate calculate = new EmployeeSalaryCalculate(100);
        System.out.println(calculate.salaryCalculate());
    }


    static void testOCP(Vehicle vehicle){
        //Vehicle vehicle = new Vehicle(100, "Vehicle");
        //System.out.println(vehicle.calculateMaxSpeed());
        //vehicle = new Car(200);
        //System.out.println(vehicle.calculateMaxSpeed());
        //vehicle = new Bus(200);
        System.out.println(vehicle.calculateMaxSpeed() + " " + vehicle.getType());
    }


    static void testDIP(){
        Car car = new Car(new DieselEngine());
        car.start();
        car = new Car(new PatrolEngine());
        car.start();
    }
}
