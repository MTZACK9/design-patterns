package com.mtzack9.gof.structural.adapter.computer.adapter;

import com.mtzack9.gof.structural.adapter.computer.HDMI;
import com.mtzack9.gof.structural.adapter.computer.VGA;


public class HDMIVGAAdapter implements VGA {

    private HDMI hdmi;


    @Override
    public void print(String message) {
        System.out.println("=============HDMI VGA Adapter==============");
        byte[] bytes = message.getBytes();
        hdmi.view(bytes);
        System.out.println("=============HDMI VGA Adapter==============");

    }

    public void setHdmi(HDMI hdmi) {
        this.hdmi = hdmi;
    }
}
