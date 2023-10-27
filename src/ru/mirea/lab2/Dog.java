package ru.mirea.lab2;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void toHumanAge(int age){
        System.out.println(7*age);
    }

    //Препод сказал вернуть имя и возраст.
    @Override
    public String toString() {
        return String.format("Name: %s Age: %s ", name, age);
    }
}