
public class StateContext {
	private Statelike currentState;
	
	public StateContext(Statelike currentState) {
		super();
		this.currentState = currentState;
		
		if(currentState == null) {
			this.currentState = StateDay.instance();
		}
		
	}
	public Statelike getCurrentState() {
		return currentState;
	}
	
	/**
	 * Setter method for the state
	 * @param newState the new state of this context
	 */
	void setCurrentState(Statelike currentState) {
		this.currentState = currentState;
		}
	
	public void update() {
		currentState.updateState(this);
	}

}
