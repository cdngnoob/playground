public class Robot {
	private String name;
	private String[] accessCodes = new String[]{"Mein ", "Zugangscode ", "ist ", "mein ", "Name: "};
	private String result = "";
	
	public Robot(String name) {
	    this.name = name;
	}
	
	public String getAccessCode() {
		// Füge hier dein Code ein
		
		for (String i : accessCodes) {
	    	this.result = this.result + i;
		}
	    
    	String res = this.result + this.name;
    	return res;
	}
}
