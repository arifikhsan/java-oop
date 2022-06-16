package org.example;

public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Arif", "Magelang");
        // person1.country = "asdf"; error karena tidak bisa mengubah variabel final

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Slamet");

        Person person2 = new Person("Bayu");

        Person person3;
        person3 = new Person();
        person3.name = "Yanto";

        person2.sayHello("Gatot");
    }
}
