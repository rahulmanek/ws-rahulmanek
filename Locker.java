class Locker {
	String id,password;
	List<Space> space;

	Locker(String id) {
		this.id = id;
		this.space = new ArrayList<>();
	}

	//1. User should be able to view list of free lockers
	public List<Space> getFreeLockers() {
		List<Space> op = new ArrayList<>();
		for(Space s in space) {
			if(s.isAvailable())
				op.add(s);
		}
		return op;
	}

	//2. Book a locker by using a passcode
	public bookLocker(userId, spaceId, password) {
		Space s = new Space(spaceId);
		if(s.isAvailable()) {
			s.bookSpace(password);
			User user = new User(userId);
		}
	}
}