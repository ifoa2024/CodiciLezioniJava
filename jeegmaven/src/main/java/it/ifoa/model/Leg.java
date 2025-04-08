package it.ifoa.model;

import it.ifoa.Side;

public class Leg {

    private Side side;

    public Leg(Side side) {
        this.side = side;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public void walkForward() {
        System.out.println("Walking forward with " + side);
    }

    public void walkBackward() {
        System.out.println("Walking backward with " + side);
    }

}
