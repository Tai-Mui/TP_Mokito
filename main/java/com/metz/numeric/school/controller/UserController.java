package com.metz.numeric.school.controller;

import com.metz.numeric.school.service.IService;
import com.metz.numeric.school.service.UserService;
import com.metz.numeric.school.view.IView;

public class UserController implements IController {

	private IView view;
	private IService service;

	// Injection de la vue ...
	public UserController(IView view) {
		this.view = view;
		this.service = new UserService();
	}

	@Override
	public void onClick() {
		view.displayMessage("A cliqué");
	}
}
