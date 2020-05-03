class Robot {
	private boolean activated = false;

	public void printStatus() {
		System.out.println(activated);
	}
	
	public boolean getActivated() {
	    return activated;
	}
	
	public void setActivated(boolean foo) {
	    this.activated = foo;
	}
}
