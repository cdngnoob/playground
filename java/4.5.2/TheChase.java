import java.util.LinkedList;

public class TheChase {
    LinkedList<Flyable> chasers = new LinkedList<>();

    public void chase() {
        for (int i = 0; i < chasers.size(); i++) {
            chasers.get(i).fly();
        }
    }
}
