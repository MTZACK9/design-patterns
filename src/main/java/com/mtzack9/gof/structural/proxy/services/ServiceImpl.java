package com.mtzack9.gof.structural.proxy.services;

public class ServiceImpl implements IService {
    @Override
    public double compute(int t) {
        System.out.println("computing............");
        return Math.cos(t * Math.PI / 180) * Math.sqrt((double) t * t);
    }
}
