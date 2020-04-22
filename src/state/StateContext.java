package state;

public class StateContext {
    private static Statelike currentState;
    private static int count = 0;

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
    public static Statelike getCurrentState() {
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
        setCount(getCount() + 1); //keeps track of how many cycles have passed
        currentState.updateState(this);
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        StateContext.count = count;
    }
    
   // public void count(int count) {
   //     setCount(count);
  //  }

}
