package com.mtzack9.gof.structural.adapter;

import com.mtzack9.gof.structural.adapter.computer.*;
import com.mtzack9.gof.structural.adapter.computer.adapter.HDMIVGAAdapter;
import com.mtzack9.gof.structural.adapter.computer.adapter.HDMIVGAAdapterInheritance;

public class Main {
    public static void main(String[] args) {
        /*
            Adapter is a structural design pattern that allows
            objects with incompatible interfaces to collaborate.
        */

        CentralUnit centralUnit = new CentralUnit();

        centralUnit.setVga(new Monitor());
        centralUnit.print("Hello World");

        centralUnit.setVga(new VideoProjector());
        centralUnit.print("Hello World");


        HDMIVGAAdapter adapter = new HDMIVGAAdapter();
        adapter.setHdmi(new TV());
        centralUnit.setVga(adapter);
        centralUnit.print("Hello World");


        centralUnit.setVga(new SuperVideoProjector());
        centralUnit.print("Hello World");

        adapter.setHdmi(new SuperVideoProjector());
        centralUnit.setVga(adapter);
        centralUnit.print("Hello World");


        System.out.println("=============Inheritance Adapter==============");
        HDMIVGAAdapterInheritance adapter1 = new HDMIVGAAdapterInheritance();
        centralUnit.setVga(adapter1);
        centralUnit.print("Hello World");
    }
}
