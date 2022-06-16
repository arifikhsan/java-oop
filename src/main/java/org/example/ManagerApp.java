package org.example;

public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Arif";
        manager.sayHello("Budi");

        var assistantManager = new AssistantManager();
        assistantManager.name = "Joko";
        assistantManager.sayHello("Budi");
    }
}
