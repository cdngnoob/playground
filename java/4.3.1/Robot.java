import java.util.ArrayList;

class Robot {
    ArrayList<AccessCode> accessCodes = new ArrayList<>();

	public Robot() {
		AccessCode firstCode = new AccessCode();
		firstCode.setCode("Federvieh");
		AccessCode secondCode = new AccessCode();
		secondCode.setCode("e.vil");
		AccessCode thirdCode = new AccessCode();
		thirdCode.setCode("2A2A");
		
        accessCodes.add(firstCode);
        accessCodes.add(secondCode);
        accessCodes.add(thirdCode);
	}
    
    
	public String getAccessCode(int i) {
        return accessCodes.get(i).getCode();
    }
    
    public ArrayList<AccessCode> getAccessCodes() {
        return accessCodes;
    }

}
