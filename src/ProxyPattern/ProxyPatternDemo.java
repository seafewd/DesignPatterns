package ProxyPattern;

public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("text_10mb.jpg");
        image.display();
    }
}
