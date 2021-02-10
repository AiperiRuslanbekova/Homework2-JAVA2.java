package com.company;


public class Main {


    public static void main(String[] args) {

        Car car = new Car("BMW", "Germany", 8);
        car.print();
        Train train = new Train("Strela", 20);
        train.print();
        Airplane airplane = new Airplane("Boeing 737", "passenger plane", 2015);
        airplane.print();
        System.out.println("----------------------");
    }


}
