package com.mtzack9.gof.structural.composite;

public class File extends Component {
    public File(String name) {
        super(name);
    }

    @Override
    public void print() {
        String tab = String.format("\t".repeat(level));
        System.out.println(tab + "File " + name);
    }
}
