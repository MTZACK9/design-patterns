package com.mtzack9.gof.structural.adapter.computer;


public class TV implements HDMI {
    @Override
    public void view(byte[] data) {
        System.out.println("=============TV==============");
        System.out.println(new String(data));
        System.out.println("=============TV==============");

    }
}
