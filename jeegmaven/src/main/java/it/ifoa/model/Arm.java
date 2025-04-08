package it.ifoa.model;

import it.ifoa.Side;

public class Arm {
    private Side side;

    public Arm(Side side) {
        this.side = side;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public void attack() {
        System.out.println("Attacking with " + side);
    }

}
