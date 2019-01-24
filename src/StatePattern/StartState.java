package StatePattern;

public class StartState implements State {


    @Override
    public void doAction(Context context) {
        System.out.println("Service started");
        context.setState(this);
    }

    public String toString() {
        return "State: Started";
    }
}
