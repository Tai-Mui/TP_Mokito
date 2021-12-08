package com.metz.numeric.school.login;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import com.metz.numeric.school.db.Database;
import com.metz.numeric.school.user.User;

public class LoginTestMockito {

	private Login login;

	private static final String USER_ID = "TEST";
	private static final String PASSWORD = "Password";

	@Before
	public void setUp() {
		// Mock de la db ..
		Database db = mock(Database.class);
		when(db.getUser(USER_ID, PASSWORD)).thenReturn(new User(USER_ID, PASSWORD));
		// Injection de la db mockée dans la classe 'Login' ...
		this.login = new Login(db);
	}

	@Test
	public void testGetLogin() {
		User user = login.getLogin(USER_ID, PASSWORD);
		assertEquals(USER_ID, user.getName());
		assertEquals(PASSWORD, user.getPassWord());
	}
}
