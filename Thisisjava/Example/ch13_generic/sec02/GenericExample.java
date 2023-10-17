package com.mystudy.scanner.Thisisjava.Example.ch13_generic.sec02;

public class GenericExample {
    public static void main(String[] args) {

        // Tv product1 정보
        // K는 Tv(클래스)로 대체, M은 String으로 대체
        Product<Tv, String> product1 = new Product();

        //Setter의 매개값은 반드시 Tv와 String을 제공
        product1.setKind(new Tv());
        product1.setModel("스마트 Tv");

        // Getter의 매개값은 Tv와 String이 됨
        Tv tv = product1.getKind();
        String tvModel = product1.getModel();

        //-----------------------------------------------------------------
        // Car Product2 정보
        // K는 Car(클래스)로 대체, M은 String으로 대체
        Product<Car, String> product2 = new Product();

        product2.setKind(new Car());
        product2.setModel("SUV자동차");

        Car car = product2.getKind();
        String carModel = product2.getModel();
    }
}
