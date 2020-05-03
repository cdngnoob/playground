import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateDetectionRobot {
	public void printDuplicates(ArrayList<String> foo, ArrayList<String> bar) {
		foo.retainAll(bar);
		
		for (String i : foo) {
		    System.out.println(i);
		}
	}
}
