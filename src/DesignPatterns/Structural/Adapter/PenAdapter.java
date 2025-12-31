package DesignPatterns.Structural.Adapter;

import DesignPatterns.Structural.Adapter.friendPen.PilotPen;

public class PenAdapter implements Pen {

    PilotPen pp = new PilotPen();

    public void write(String str) {
        pp.mark(str);
    }
}
