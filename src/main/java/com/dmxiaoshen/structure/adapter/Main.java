package com.dmxiaoshen.structure.adapter;

/**
 * Created by hzhsg on 2018/4/28.
 * 适配器模式
 */
public class Main {

    public static void main(String[] args) {
        testVoltageAdapter1();
        testVoltageAdapter2();
        testInterfaceAdapter3();

    }

    public static void testVoltageAdapter1(){
        Mobile mobile = new Mobile();
        mobile.charging(new VoltageAdapter1());
    }

    public static void testVoltageAdapter2(){
        Mobile mobile = new Mobile();
        mobile.charging(new VoltageAdapter2(new Voltage220V()));
    }

    public static void testInterfaceAdapter3(){
        InterfaceAdapter3 interfaceAdapter3 = new InterfaceAdapter3(new ListenerAdapter() {
            @Override
            public void start() {
                System.out.println("I am start");
            }

            @Override
            public void stop() {
                System.out.println("I am stop");
            }
        });
        interfaceAdapter3.run();
    }
}
