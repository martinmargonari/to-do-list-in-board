import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

/**
 * Created by Margonari on 31/03/2017.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TaskTest {

    @Test
    public void createFirstTaskHasIdOne() {
        Task task = new Task("A description");

        assertEquals(task.getId(),1);
    }

    @Test
    public void createSecondTaskHasIdTwo() {
        Task task = new Task("A description");

        assertEquals(task.getId(),2);
    }

    @Test
    public void createTaskWithDescription() {
        Task task = new Task("A description");

        assertEquals(task.getDescription(),"A description");
    }


}
