package ObserverPattern;

public class BinaryObserver extends Observer {

    BinaryObserver(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(observable.getState()).toUpperCase());
    }
}
