package StatePattern;

public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Service stopped");
        context.setState(this);
    }

    public String toString() {
        return "State: Stopped";
    }
}
