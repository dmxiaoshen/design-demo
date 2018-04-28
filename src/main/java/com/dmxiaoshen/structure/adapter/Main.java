package com.dmxiaoshen.structure.adapter;

/**
 * Created by hzhsg on 2018/4/28.
 */
public class Main {

    public static void main(String[] args) {
        testVoltageAdapter1();
        testVoltageAdapter2();

    }

    public static void testVoltageAdapter1(){
        Mobile mobile = new Mobile();
        mobile.charging(new VoltageAdapter1());
    }

    public static void testVoltageAdapter2(){
        Mobile mobile = new Mobile();
        mobile.charging(new VoltageAdapter2(new Voltage220V()));
    }
}
