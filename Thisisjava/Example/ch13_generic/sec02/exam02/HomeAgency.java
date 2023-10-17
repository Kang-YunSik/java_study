package com.mystudy.scanner.Thisisjava.Example.ch13_generic.sec02.exam02;

public class HomeAgency implements Rentable<Home>{
    @Override
    public Home rent() {
        return new Home();
    }
}
