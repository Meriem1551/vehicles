package org.vehicle;

public class Main {
    public static void main(String[] args) {
        Truck T = new Truck(12345, "toyota", 100F, 1, 120.65F, 23);
        T.load(120);
        T.accelerate();
        T.showWeight();

        Bus B = new Bus(2793663, "Suzuku", 140F, 0, 20, 100);
        B.stop();
        B.descend(5);
        B.showTraveler();
    }
}