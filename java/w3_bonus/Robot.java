public class Robot {
	
	String factory = "Deutschland";

	void printSysteminfo(){
		System.out.println("Ich wurde in " + getFactory() + " gebaut.");
	}
	
	String getFactory(){
		return factory;
	}
	
}
