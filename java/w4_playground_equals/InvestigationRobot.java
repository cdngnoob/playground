public class InvestigationRobot extends Robot {
	
	private String type;
	
	public InvestigationRobot(String name, String type) {
		super(name);
		this.type = type;
	}
	
	public String getName() {
		return this.getName();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvestigationRobot other = (InvestigationRobot) obj;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
}
