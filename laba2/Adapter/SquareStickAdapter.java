package org.example.laba.laba2.Adapter;

public class SquareStickAdapter extends RoundStick {

private SquareStick stick;

public SquareStickAdapter(SquareStick stick) {
    super();

    this.stick = stick;
        }

public int getRadius() {
    return (int) (stick.getWidth() * Math.sqrt(2) / 2);
}

        }