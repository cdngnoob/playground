import java.util.ArrayList;

public class Story {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		
		list1.add("Katze");
		list1.add("Hund");
		list1.add("Maus");
		list1.add("Roboter");
		list1.add("Pinguin");
		list1.add("Strauß");
		list1.add("Papagei");
		list1.add("Wurm");
		list1.add("Fisch");
		list1.add("Kuh");
		
		list2.add("Roboter");
		list2.add("Storch");
		list2.add("Kuh");
		list2.add("Maus");
		list2.add("Strauß");
		list2.add("Hund");
		list2.add("Tiger");
		list2.add("Pinguin");
		list2.add("Hamster");
		list2.add("Ratte");
		
		DuplicateDetectionRobot rolf = new DuplicateDetectionRobot();
		rolf.printDuplicates(list1, list2);
		
	}
}