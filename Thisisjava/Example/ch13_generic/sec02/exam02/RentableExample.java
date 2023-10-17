package com.mystudy.scanner.Thisisjava.Example.ch13_generic.sec02.exam02;

public class RentableExample {
    public static void main(String[] args) {

        HomeAgency homeAgency = new HomeAgency();
        Home home = homeAgency.rent();
        home.turnOnLight();

        CarAgency carAgency = new CarAgency();
        Car car = carAgency.rent();
        car.run();
    }
}
