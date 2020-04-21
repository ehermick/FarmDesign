package state;

//STATE PATTERN

public class StateNight implements Statelike {
    private static StateNight instance = new StateNight();

    /**
     * Constructor.
     */
    private StateNight() {

    }

    /**
     * Night instance.
     * @return StateNight instance of night
     */
    public static StateNight instance() {
        return instance;
    }

    @Override
    public void updateState(StateContext context) {
        System.out.println("--------------Night Time Summary--------------"); //Night time
        context.setCurrentState(StateDay.instance());//Switch to day time
    }
    


}
