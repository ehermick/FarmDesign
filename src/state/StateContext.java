package state;

public class StateContext {
    private Statelike currentState;
    public static int count = 0;

    /**
     * Initializes the current state - beginning with day time.
     * @param currentState The current state
     */
    public StateContext(Statelike currentState) {
            super();
        this.currentState = currentState;

        if (currentState == null) {
            this.currentState = StateDay.instance();
        }

    }
    
    /**
     * Returns the current state.
     * @return currentState the current state
     */
    public Statelike getCurrentState() {
        return currentState;
    }

    /**
     * Setter method for the state.
     * @param newState the new state of this context
     */
    void setCurrentState(Statelike currentState) {
        this.currentState = currentState;
    }

    /**
     * Updates the current state.
     */
    public void update() {
        count++; //keeps track of how many cycles have passed
        currentState.updateState(this);
    }

}
