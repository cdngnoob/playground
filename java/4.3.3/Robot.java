import java.util.ArrayList;
import java.util.HashMap;

class Robot {
    ArrayList<AccessCode> usedAccessCodes = new ArrayList<>();
	ArrayList<AccessCode> unusedAccessCodes = new ArrayList<>();
	HashMap<String, ArrayList> codeHashMap = new HashMap<>() ;

	public void saveCodes(ArrayList<AccessCode> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getUsed()) {
			    usedAccessCodes.add(list.get(i));
			} else {
			    unusedAccessCodes.add(list.get(i));
			}
		}
	}
	
	public void buildHashMap() {
		codeHashMap.put("used", usedAccessCodes);
		codeHashMap.put("unused", unusedAccessCodes);
	}
}
