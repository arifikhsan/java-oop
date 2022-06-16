package org.example.shadowing;

public class AssistantManager extends Manager {

    AssistantManager(String name) {
        super(name);
    }
    void sayHello(String name) {
        System.out.println("Hello " + name + ". My name is Assistant Manager " + this.name);
    }
}
