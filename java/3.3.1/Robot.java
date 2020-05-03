class Robot {
	private int batteryRuntime = 0;
    private boolean bar;
    
    private boolean notNegative(int foo) {
        if (foo >= 0) {
            bar = true;
        } else {
            bar = false;
        }
        
        return bar;
    }
    
	public void setBatteryRuntime(int newTime) {
	    if (notNegative(newTime)) {
		    batteryRuntime = newTime;
		    }
	}

	public int getBatteryRuntime() {
		return batteryRuntime;
	}
}
