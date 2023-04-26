package com.java.main;

import com.java.view.AppUI;

import static com.java.view.AppUI.inputInteger;

public class Main {

	public static void main(String[] args) {
		
		
		AppController controller = new AppController();
		
		while(true) {
			//메뉴 보여줌.
			AppUI.startScreen();
			//정수 받아줌.
			int selectNumber = AppUI.inputInteger();
			controller.chooseSystem(selectNumber);
		}
 
	}

}
