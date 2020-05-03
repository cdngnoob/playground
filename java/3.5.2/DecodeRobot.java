class DecodeRobot {
    public void tap(String foo, int bar) {
        for (int i = 0; i < bar; i++) {
            System.out.println(foo);
        }
    }
    
    public void tap(String foobar) {
        this.tap(foobar, 3);
    }
}
