import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Margonari on 31/03/2017.
 */
public class Board {

    private HashMap<Integer,ArrayList<Task>> board;

    public Board(ArrayList<Integer> initialStates) {
        board = new HashMap<>();
        for (int state: initialStates) {
            board.put(state,new ArrayList<>());
        }
    }

    public void addTask(int state, Task task) {
        Task newTask = new Task(task.getDescription());

        board.get(state).add(task);
    }

    public ArrayList<Task> getTasks(int state) {
        return board.get(state);
    }

    public void addState(int state) {
        board.put(state, new ArrayList<>());
    }

    public void changeTaskState(int order, int oldState, int newState) {
        Task taskToMove = board.get(oldState).remove(order);
        board.get(newState).add(taskToMove);
    }

}
