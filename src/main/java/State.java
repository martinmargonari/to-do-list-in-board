/**
 * Created by Margonari on 31/03/2017.
 */
public class State {

    private int id;
    private String name;

    private static int AUTO_INCREMENT = 1;

    public State(String name) {
        this.id = AUTO_INCREMENT;
        this.name = name;

        AUTO_INCREMENT++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
