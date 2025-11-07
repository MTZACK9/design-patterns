package com.mtzack9.gof.behavioral.templatemethod.templates;

public class TemplateImp extends Template{

    @Override
    protected double compute(int a, int b) {
        return Math.sqrt((double) a*a + b*b);
    }

    @Override
    protected int param1() {
        return 3;
    }
}
