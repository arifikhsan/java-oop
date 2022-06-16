package org.example.shadowing;

public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Arif");
        manager.name = "Arif";
        manager.sayHello("Budi");

        var assistantManager = new AssistantManager("Joko");
        assistantManager.name = "Joko";
        assistantManager.sayHello("Budi");
    }
}
