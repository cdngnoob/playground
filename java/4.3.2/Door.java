import java.util.HashMap;

class Door {
	HashMap<String, AccessCode> doorCodes = new HashMap<>();
	
	public void addDoorKey(String foo, AccessCode bar) {
		doorCodes.put(foo, bar);
	}
	
	public void useCode(String key) {
		if (doorCodes.containsKey(key)) {
			AccessCode result = doorCodes.get(key);
			
			int get = result.getNumberOfTimesUsed();
			int set = get + 1;
			result.setNumberOfTimesUsed(set);

			int get2 = result.getNumberOfTimesUsed();
			if (get2 > 2) {
				result.setValid(false);
				System.out.println("Schlüssel nicht mehr gültig");
			} else {
				result.setValid(true);
				System.out.println("Schlüssel gültig");
			}
			
		}
	}

	public HashMap<String, AccessCode> getDoorCodes() {
		return doorCodes;
	}
}