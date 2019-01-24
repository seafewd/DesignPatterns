package VisitorPattern;

public class Monitor implements ComputerPart {

    public Monitor() {
        System.out.println("Monitor built");
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
