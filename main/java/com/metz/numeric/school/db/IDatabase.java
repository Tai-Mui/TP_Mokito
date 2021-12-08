package com.metz.numeric.school.db;

import com.metz.numeric.school.user.User;

public interface IDatabase {

	User getUser(String loginId, String pwd);

	User getAdminUser();
}
