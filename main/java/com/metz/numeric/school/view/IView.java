package com.metz.numeric.school.view;

import com.metz.numeric.school.controller.IController;

public interface IView {

	void setControler(IController controler);

	String displayMessage(String message);
}
