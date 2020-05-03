public class SuperVillain implements Flyable, Catchable {

    public void fly() {
        System.out.println("Ich fliege mit meinem SuperVillain-Umhang!");
    }
    
    public void tryToCatch(boolean foo) {
    	if (foo) {
    		System.out.println("Eike Vil fängt Paco");
    	} else {
    		System.out.println("Eike Vil fängt Paco nicht");
    	}
    }

}