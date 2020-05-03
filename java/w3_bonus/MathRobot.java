public class MathRobot extends Robot {
	
	String mathEngine = "V20.1";
    
    @Override
    void printSysteminfo(){
		super.printSysteminfo();
		System.out.println("Ich nutze math engine " + this.getMathEngine());
	}
    
	String getMathEngine(){
		return mathEngine;
	}
	
}
