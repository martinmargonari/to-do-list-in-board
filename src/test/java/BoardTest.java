import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Margonari on 31/03/2017.
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BoardTest {

    @Test
    public void createBoardWithState() {
        ArrayList<Integer> states = new ArrayList<>();
        State state = new State("To Do");
        states.add(state.getId());

        Board board = new Board(states);

        assertTrue(board instanceof Board);
    }

    @Test
    public void addATask() {
        ArrayList<Integer> states = new ArrayList<>();
        State state = new State("To Do");
        states.add(state.getId());

        Board board = new Board(states);

        String description = "This task must be Done";
        Task task = new Task(description);

        board.addTask(state.getId(),task);

        ArrayList<Task> tasksToDo = board.getTasks(state.getId());

        assertEquals(tasksToDo.get(0).getDescription(),description);
    }

    @Test
    public void addAState() {
        ArrayList<Integer> states = new ArrayList<>();
        State state = new State("To Do");
        states.add(state.getId());

        Board board = new Board(states);
        State stateDoing = new State("Doing");
        board.addState(stateDoing.getId());

        String description = "This task must be Done";
        Task task = new Task(description);

        board.addTask(stateDoing.getId(),task);

        ArrayList<Task> tasksDoing = board.getTasks(stateDoing.getId());

        assertEquals(tasksDoing.get(0).getDescription(),description);
    }

    @Test
    public void listTasksInState() {
        ArrayList<Integer> states = new ArrayList<>();
        State state = new State("To Do");
        State stateDoing = new State("Doing");
        states.add(state.getId());
        states.add(stateDoing.getId());

        Board board = new Board(states);

        String description = "This task must be Done";
        Task task = new Task(description);
        board.addTask(state.getId(),task);
        board.addTask(state.getId(),task);
        board.addTask(state.getId(),task);

        ArrayList<Task> tasksToDo = board.getTasks(state.getId());

        assertEquals(tasksToDo.size(),3);
    }

    @Test
    public void changeTaskState() {
        ArrayList<Integer> states = new ArrayList<>();
        State stateToDo = new State("To Do");
        State stateDoing = new State("Doing");
        states.add(stateToDo.getId());
        states.add(stateDoing.getId());

        Board board = new Board(states);

        String description = "This task must be Done";
        Task task = new Task(description);
        board.addTask(stateToDo.getId(),task);

        board.changeTaskState(0,stateToDo.getId(),stateDoing.getId());

        ArrayList<Task> toDoTasks = board.getTasks(stateDoing.getId());

        assertEquals(toDoTasks.get(0).getDescription(), description);
    }


}
