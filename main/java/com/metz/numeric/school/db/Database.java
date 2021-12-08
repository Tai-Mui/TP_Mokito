package com.metz.numeric.school.db;

import com.metz.numeric.school.user.User;

public class Database implements IDatabase {

	// simulation accès db.

	@Override
	public User getUser(String loginId, String pwd) {
		return new User("Stéphane", "JOYEUX");
	}

	@Override
	public User getAdminUser() {
		return new User("ADMIN", "ADMIN");
	}

}
