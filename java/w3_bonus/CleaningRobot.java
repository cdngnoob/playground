public class CleaningRobot extends Robot {
	
	String task = "Küche";
	
	@Override
	void printSysteminfo(){
		super.printSysteminfo();
		System.out.println("Ich putze gerade: " + this.getTask());
	}
	
	String getTask(){
		return task;
	}
}
