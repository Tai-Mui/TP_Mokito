package com.metz.numeric.school.view;

import com.metz.numeric.school.controller.IController;

public class View implements IView {

	private IController controler;

	@Override
	public void setControler(IController controler) {
		this.controler = controler;
	}

	@Override
	public String displayMessage(String message) {
		System.out.println(message);
		return message;
	}
}
