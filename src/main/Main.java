package main;
import state.StateContext;




public class Main {
	
	public static void main(String[] args) {

	    //Start off at day time
		StateContext context = new StateContext(null);
		context.update();
		context.update();
		context.update();
		context.update();
		
		NewFarm.buildFarm(); //Build a new farm
		

	}

}
