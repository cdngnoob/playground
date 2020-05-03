class Robot {
    private int batteryRuntime = 2;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getBatteryRuntime() {
        return batteryRuntime;
    }

    public void rechargeBattery() {
        batteryRuntime=10;
    }

    public void saySomething() {
        System.out.println(createSentence());
    }

    private String createSentence() {
        return "Meine Batterie reicht " + batteryRuntime + " Stunden.";
    }
}
