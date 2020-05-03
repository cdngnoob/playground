class AccessCode {

	private String code;
	private boolean used;

	AccessCode(String code, boolean used) {
		this.code = code;
		this.used = used;			
	}

	public String getCode() {
		return code;
	}

	public boolean getUsed() {
		return used;
	}
}
