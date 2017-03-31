import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

/**
 * Created by Margonari on 31/03/2017.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StateTest {

    @Test
    public void createFirstStateHasIDOne() {
        State state = new State("To Do");

        assertEquals(state.getId(),1);
    }

    @Test
    public void createSecondStateHasIDTwo() {
        State stateTwo = new State("Doing");

        assertEquals(stateTwo.getId(),2);
    }

    @Test
    public void createStateWithName() {
        State state = new State("To Do");

        assertEquals(state.getName(),"To Do");
    }


}
