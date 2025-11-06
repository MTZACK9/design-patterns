package com.mtzack9.gof.structural.composite;

public class Main {
    public static void main(String[] args) {
        /*
            Composite is a structural design pattern that lets you compose objects into tree
            structures and then work with these structures as if they were individual objects.
        */

        Folder root = new Folder("/");
        root.addChild(new File("design.java"));
        root.addChild(new File("config.java"));
        Folder entities = (Folder) root.addChild(new Folder("entities"));
        Folder repositories = (Folder) root.addChild(new Folder("repositories"));

        entities.addChild(new File("Product.java"));
        entities.addChild(new File("Category.java"));
        repositories.addChild(new File("ProductRepository.java"));
        repositories.addChild(new File("CategoryRepository.java"));

        root.print();

    }
}
