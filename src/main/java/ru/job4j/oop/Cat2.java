package ru.job4j.oop;

import java.sql.SQLOutput;

public class Cat2 {
    private String food;
    private String name;

    public void show() {
        System.out.println(this.food);
        System.out.println(this.name);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat2 gav = new Cat2();
        gav.eat("kotleta");
        gav.giveNick("Gav");
        gav.show();

        System.out.println("There are black's food.");
        Cat2 black = new Cat2();
        black.eat("fish");
        black.giveNick("Black");
        black.show();

    }
}
