package org.example.shadowing;

public class Manager {
    String name;
    String company;

    Manager(String name) {
        this.name = name;
    }

    public Manager(String name, String company) {
        this.name = name;
        this.company = company;
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ". My name is Manager " + this.name);
    }
}
