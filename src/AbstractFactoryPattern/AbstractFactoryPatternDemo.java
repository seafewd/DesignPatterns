package AbstractFactoryPattern;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {

        //shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        Shape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.draw();

        Shape square = shapeFactory.getShape("Square");
        square.draw();

        //rounded shape factory
        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);

        Shape roundedRectangle = roundedShapeFactory.getShape("Rectangle");
        roundedRectangle.draw();

        Shape roundedSquare = roundedShapeFactory.getShape("Square");
        roundedSquare.draw();
    }

}
