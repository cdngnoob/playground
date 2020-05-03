class Story {
    public static void main(String[] args) {
        Robot ronja = new Robot();
        ronja.setName("Ronja");
        System.out.println("Ich bin " + ronja.getName());
        ronja.saySomething();
        
        if (ronja.getBatteryRuntime() < 3) {
            ronja.rechargeBattery();
            System.out.println("Nach dem Laden reicht meine Batterie " + ronja.getBatteryRuntime() + " Stunden.");
        }
    }
}
