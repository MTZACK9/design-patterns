package com.mtzack9.gof.structural.adapter.computer;

public class VideoProjector implements VGA{
    @Override
    public void print(String message) {
        System.out.println("=============Video Projector===============");
        System.out.println(message);
        System.out.println("=============Video Projector===============");
    }
}
