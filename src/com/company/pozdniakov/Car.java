package com.company.pozdniakov;

public class Car extends Vehicle {
    public Car(int id) {
        super(id);
    }

    @Override
    public void move(int id) {
        System.out.println("Машина №" + id + "виїхала.");
    }
}

