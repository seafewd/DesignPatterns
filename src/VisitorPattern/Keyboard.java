package VisitorPattern;

public class Keyboard implements ComputerPart {

    public Keyboard() {
        System.out.println("Keyboard built");
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
