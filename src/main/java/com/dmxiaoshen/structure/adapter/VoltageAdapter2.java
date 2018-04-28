package com.dmxiaoshen.structure.adapter;

/**
 * Created by hzhsg on 2018/4/28.
 * 对象适配，
 */
public class VoltageAdapter2 implements V5 {

    private Voltage220V voltage220V;

    public VoltageAdapter2(Voltage220V voltage220V){
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5v() {
        int v = voltage220V.output220v();
        v = v/44;
        System.out.println("VoltageAdapter2适配后输出电压"+v+"v");
        return v;
    }
}
