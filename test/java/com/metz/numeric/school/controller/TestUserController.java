package com.metz.numeric.school.controller;

import org.junit.Before;
import org.mockito.Matchers;
import org.mockito.Mockito;

import com.metz.numeric.school.view.IView;
import com.metz.numeric.school.view.View;

public class TestUserController {

	private UserController controller;

	@Before
	public void setUp() {
		IView view = Mockito.mock(View.class);
		this.controller = new UserController(view);
		Mockito.when(view.displayMessage(Matchers.anyString())).thenReturn("OK!!");
	}

}
