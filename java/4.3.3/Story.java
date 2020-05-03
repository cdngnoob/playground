import java.util.ArrayList;

class Story {

	public static void main(String[] args) {
		ArrayList<AccessCode> accessCodes = new ArrayList<>();
		
		AccessCode code1 = new AccessCode("Federvieh", true);
		AccessCode code2 = new AccessCode("e.vil", true);
		AccessCode code3 = new AccessCode("Haifischbecken", false);
		AccessCode code4 = new AccessCode("2A2A", false);
		
		accessCodes.add(code1);
		accessCodes.add(code2);
		accessCodes.add(code3);
		accessCodes.add(code4);

		Robot ronja = new Robot();
		ronja.saveCodes(accessCodes);
		ronja.buildHashMap();
	}
}
