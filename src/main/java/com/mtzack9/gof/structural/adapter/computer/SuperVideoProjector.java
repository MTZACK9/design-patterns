package com.mtzack9.gof.structural.adapter.computer;

public class SuperVideoProjector implements VGA, HDMI {
    @Override
    public void print(String message) {
        System.out.println("=============Super VP VGA===============");
        System.out.println(message);
        System.out.println("=============Super VP VGA===============");
    }

    @Override
    public void view(byte[] data) {
        System.out.println("=============Super VP HDMI===============");
        System.out.println(new String(data));
        System.out.println("=============Super VP HDMI===============");

    }
}
