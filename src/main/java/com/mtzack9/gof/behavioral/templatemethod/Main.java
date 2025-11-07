package com.mtzack9.gof.behavioral.templatemethod;

import com.mtzack9.gof.behavioral.templatemethod.templates.Template;
import com.mtzack9.gof.behavioral.templatemethod.templates.TemplateImp;
import com.mtzack9.gof.behavioral.templatemethod.templates.TemplateImp2;

public class Main {
    public static void main(String[] args) {
        /*
            Template Method is a behavioral design pattern that defines the skeleton of an algorithm in the superclass
            but lets subclasses override specific steps of the algorithm without changing its structure.
        */

        Template template = new TemplateImp();
        System.out.println(template.perform(2,5));

        template = new TemplateImp2();
        System.out.println(template.perform(2,5));

    }
}
