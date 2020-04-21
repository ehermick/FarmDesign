package main;
import farm.HybridFarm;
import state.StateContext;




public class Main {
	
	public static void main(String[] args) {
		
		NewFarm.buildFarm(); //Build a new farm
		
	      //Start off at day time
        StateContext context = new StateContext(null);
        context.update();
        
        //Check for births
        HybridFarm.birth();
        
        //Check for deaths
        HybridFarm.death();
		

	}

}
