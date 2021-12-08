package com.metz.numeric.school.main;

import com.metz.numeric.school.controller.IController;
import com.metz.numeric.school.controller.UserController;
import com.metz.numeric.school.view.IView;
import com.metz.numeric.school.view.View;

public class TestProgram {

	public static void main(String[] args) {
		IView view = new View();
		IController controller = new UserController(view);
		view.setControler(controller);
		controller.onClick();
	}
}
