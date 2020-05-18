package com.company.pozdniakov;

public class RollerSkates extends Vehicle{
    public RollerSkates(int id) {
        super(id);
    }

    @Override
    public void move(int id) {
        System.out.println("Ковзани №" + id + "виїхали");
    }
}

