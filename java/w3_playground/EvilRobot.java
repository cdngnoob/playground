public class EvilRobot extends Robot {

	@Override
	public void move() {
		System.out.println("EvilRobot: Get out of my way or I'll run over you!!");
	}

	@Override
	public void act() {
		System.out.println("EvilRobot: Kill the parrots!!");
	}
}
