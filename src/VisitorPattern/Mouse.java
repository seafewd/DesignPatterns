package VisitorPattern;

public class Mouse implements ComputerPart {

    public Mouse() {
        System.out.println("Mouse built");
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
