package story;
import experiment.*;

public class Story {

	public static void main(String args[]) {
		TestRobot tr = new TestRobot();
		Terminal terminal = new Terminal();
		terminal.hackRobot(tr);
	}

}
