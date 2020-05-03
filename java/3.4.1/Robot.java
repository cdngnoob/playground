class Robot extends OldRobot {
	int internalStorageSize = 7;
    
    public void greetUser() {
		System.out.println("Hallo Duke!");
	}
	
	public int getInternalStorageSize() {
		return this.internalStorageSize;
	}
}
