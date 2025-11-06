package com.mtzack9.gof.structural.adapter.computer.adapter;

import com.mtzack9.gof.structural.adapter.computer.HDMI;
import com.mtzack9.gof.structural.adapter.computer.TV;
import com.mtzack9.gof.structural.adapter.computer.VGA;


public class HDMIVGAAdapterInheritance extends TV implements VGA {


    @Override
    public void print(String message) {
        System.out.println("=============HDMI VGA Adapter==============");
        byte[] bytes = message.getBytes();
        super.view(bytes);
        System.out.println("=============HDMI VGA Adapter==============");

    }
}
