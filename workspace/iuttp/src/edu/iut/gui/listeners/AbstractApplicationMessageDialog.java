package edu.iut.gui.listeners;

import edu.iut.app.IApplicationLogListener;

public abstract class AbstractApplicationMessageDialog implements
		IApplicationLogListener {

	@Override
	public void newMessage(String level, String message) {
		showMessage();
	}
	
	protected abstract void showMessage();

	protected void showMessage(String level, String message) {
	
	}
	
	
}
