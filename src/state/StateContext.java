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
            setCurrentState(currentState);

        if (currentState == null) {
            setCurrentState(StateDay.instance());
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
    static void  setCurrentState(Statelike currentStateInput) {
        currentState = currentStateInput;
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
