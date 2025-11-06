package com.mtzack9.gof.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {
    private List<Component> components = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void print() {
        String tab = String.format("\t".repeat(level));
        System.out.println(tab + "Folder " + name);
        for (Component component : components) {
            component.print();
        }
    }

    public Component addChild(Component component) {
        component.level = this.level + 1;
        components.add(component);
        return component;
    }
}
