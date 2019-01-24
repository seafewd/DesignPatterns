package ObserverPattern;

public class OctalObserver extends Observer {

    OctalObserver(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(observable.getState()).toUpperCase());
    }
}
