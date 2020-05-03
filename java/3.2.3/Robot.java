class Robot {
	private String internalStorage = "416e737765723f203432";
    
    private void flushStorage() {
        internalStorage = "";
    }
    
    public void safeFlushStorage(String pw) {
        if (pw.equals("pw_duke")) {
            System.out.println(internalStorage);
            flushStorage();
        } else {
            flushStorage();
        }
    }
}
