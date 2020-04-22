package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import state.StateContext;
import state.StateDay;
import state.StateNight;
import state.Statelike;

public class TestCycle {
    
    StateContext context;
    
    //Day
    @Test
    public void testDay() {
        
        context = new StateContext(null); //Day
        
        Statelike expected = StateDay.returnState();
        Statelike actual = StateContext.getCurrentState();

        assertEquals("Day Time", expected, actual);
    }
    
    //Night
    @Test
    public void testNight() {
        
        
        context = new StateContext(null); //Day
        context.update(); //Night
        
        Statelike expected = StateNight.returnState();
        Statelike actual = StateContext.getCurrentState();
        assertEquals("Night Time", expected, actual);
    }
    
    @Test
    public void testState() {
        context = new StateContext(null); //Day
        context.update(); //Night
        context.update(); //Day
        context.update(); //Night
        context.update(); //Day
        
        
        Statelike expected = StateDay.returnState();
        Statelike actual = StateContext.getCurrentState();
        assertEquals("Day Time", expected, actual);
    }


}
