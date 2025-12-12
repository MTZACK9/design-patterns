package com.mtzack9.gof.creational.singletonbuilderprototype.model;

public class Customer implements Cloneable {
    private String id;
    private String name;

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Customer() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return  "Customer{" + "id=" + id + ", name=" + name + '}';
    }

    @Override
    public Customer clone() {
        try {
            return (Customer) super.clone();
        } catch (CloneNotSupportedException _) {
            throw new AssertionError();
        }
    }
}
