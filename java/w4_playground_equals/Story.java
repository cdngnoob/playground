public class Story {

	public static void main(String[] args) {
		Robot ronja1 = new InvestigationRobot("Ronja", "Detective's Dream");
		InvestigationRobot ronja2 = (InvestigationRobot) ronja1;
		InvestigationRobot ronja3 = new InvestigationRobot("Ronja", "Detective's Dream");
		
		System.out.println("=================================");
		System.out.println(ronja1.equals(ronja2));
		System.out.println(ronja1.equals(ronja3));
		System.out.println(ronja2.equals(ronja3));
		System.out.println(ronja2.equals(ronja1));
		System.out.println(ronja3.equals(ronja1));
		System.out.println(ronja3.equals(ronja2));
		
		Robot ronja4 = new ExactlyTheSameRobot("Ronja");
		Robot ronja5 = new Robot("Ronja");
		System.out.println("=================================");
		System.out.println(ronja4.equals(ronja5));
		System.out.println(ronja5.equals(ronja4));
		
		InstanceRobot ronja6 = new InstanceRobot("Ronja");
		InstanceRobot ronja7 = new AnotherInstanceRobot("Ronja");
		System.out.println("=================================");
		System.out.println(ronja6.equals(ronja7));
		System.out.println(ronja7.equals(ronja6));
		System.out.println("=================================");
		
		System.out.println(ronja1.getClass());
		System.out.println(ronja2.getClass());
		System.out.println(ronja3.getClass());
		System.out.println(ronja4.getClass());
		System.out.println(ronja5.getClass());
		System.out.println(ronja6.getClass());
		System.out.println(ronja7.getClass());
		
		System.out.println("=================================");
		
		System.out.println("Ronja1 iof Robot: " + (ronja1 instanceof Robot) );
		System.out.println("Ronja1 iof InvestigationRobot: " + (ronja1 instanceof InvestigationRobot) );
		System.out.println("Ronja1 iof Object: " + (ronja1 instanceof Object) );
		Object ronjaS = new String("Ronja1");
		System.out.println("\"Ronja1\" iof Robot: " + (ronjaS instanceof Robot) );
		
		System.out.println("=================================");
		
		System.out.println("Ronja6 iof InstanceRobot: " + (ronja6 instanceof InstanceRobot) );
		System.out.println("Ronja7 iof InstanceRobot: " + (ronja7 instanceof InstanceRobot) );
		System.out.println("Ronja6 iof AnotherInstanceRobot: " + (ronja6 instanceof AnotherInstanceRobot) );
		System.out.println("Ronja7 iof AnotherInstanceRobot: " + (ronja7 instanceof AnotherInstanceRobot) );
		
		
	}

}
