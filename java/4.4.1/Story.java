import java.util.ArrayList;

public class Story {

	public static void main(String[] args) {
		Robot ronja = new Robot();
		ArrayList<String> accessCodes = new ArrayList<String>();
		accessCodes.add("Sesam");
		accessCodes.add("oeffne");
		accessCodes.add("dich!");
		ronja.giveAccessCodes(accessCodes);
	}

}
