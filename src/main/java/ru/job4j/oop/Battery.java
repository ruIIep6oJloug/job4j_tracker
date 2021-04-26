package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int charge) {
        this.load = charge;
    }


    public void exchange(Battery another) {
    another.load = this.load + another.load;
    this.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(50);
        Battery second = new Battery(30);
        Battery another = new Battery(20);
        System.out.println("First : " + first.load + " second : " + second.load + " another : " + another.load);
        second.exchange(another);
        System.out.println("First : " + first.load + " second : " + second.load + " another : " + another.load);
    }
}
