import java.util.HashMap;

/**
 * Created by Margonari on 31/03/2017.
 */
public class Task {

    private int id;
    private String description;

    private static int AUTOINCREMENT = 1;

    public Task(String description) {
        this.id = AUTOINCREMENT;
        this.description = description;

        AUTOINCREMENT++;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

}
