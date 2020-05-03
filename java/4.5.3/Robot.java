public class Robot implements Flyable, Catchable {

    public void fly() {
        System.out.println("Ich fliege mit meinen Raketen!");
    }
    
    public void tryToCatch(boolean foo) {
    	if (foo) {
    		System.out.println("Ronja fängt Paco");
    	} else {
    		System.out.println("Ronja fängt Paco nicht");
    	}
    }
}