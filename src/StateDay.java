//STATE PATTERN


public class StateDay implements Statelike {
	
	private static StateDay instance = new StateDay();
	
	private StateDay() {
		
	}
	
	public static StateDay instance() {
		return instance;
	}
	
	@Override
	public void updateState(StateContext context) {
		System.out.println("Day Time"); //Day time
		context.setCurrentState(StateNight.instance()); //Switch to nightime
	}
	


}
