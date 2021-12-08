package com.metz.numeric.school.service;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.metz.numeric.school.db.Database;
import com.metz.numeric.school.db.IDatabase;
import com.metz.numeric.school.user.User;

public class TestUserService {

	private UserService service;

	@Before
	public void setUp() {
		IDatabase db = Mockito.mock(Database.class);
		this.service = new UserService(db);
		when(db.getUser(anyString(), anyString())).thenReturn(new User("TEST", "TEST"));
	}

	@Test
	public void testGetUserFromService() {
		assertEquals("TEST", service.getUser("fsf", "fge").getName());
	}

}
