class Space {
	String id,password;

	Space(id) {
		this.id = id;
	}

	public void bookSpace(password) {
		if(this.password != null)
			return "Already booked";
		this.password = password;
	}

	public boolean isAvailable() {
		this.password == null;
	}
}