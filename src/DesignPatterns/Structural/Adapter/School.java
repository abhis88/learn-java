package DesignPatterns.Structural.Adapter;

public class School {
    static void main() {
        Pen pen = new PenAdapter();
        AssignmentWork assignmentWork = new AssignmentWork();
        assignmentWork.setP(pen);
        assignmentWork.writeAssignment("I am bit tired of writing assignment");
    }
}
