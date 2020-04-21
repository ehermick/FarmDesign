package main;
import state.StateContext;

public class Main {
	
	public static void main(String[] args) {
		StateContext context = new StateContext(null);
		context.update();
		context.update();
		context.update();
		context.update();
	}

}
