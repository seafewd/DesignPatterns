package ObserverPattern;

public class HexaObserver extends Observer {

    HexaObserver(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(observable.getState()).toUpperCase());
    }
}
