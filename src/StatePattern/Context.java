package StatePattern;

public class Context {
    private State state;

    Context() {
        this.state = null;
    }

    State getState() {
        return state;
    }

    void setState(State state) {
        this.state = state;
    }
}
