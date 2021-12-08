package com.metz.numeric.school.service;

import com.metz.numeric.school.db.Database;
import com.metz.numeric.school.db.IDatabase;
import com.metz.numeric.school.user.User;

public class UserService implements IService {

	private User user;
	private IDatabase db;

	public UserService() {
		this.db = new Database();
	}

	public UserService(IDatabase db) {
		this.db = db;
	}

	public User getUser(String userId, String pwd) {
		return db.getUser(userId, pwd);
	}
}
