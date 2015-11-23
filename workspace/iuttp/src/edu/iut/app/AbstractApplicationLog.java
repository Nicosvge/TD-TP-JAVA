package edu.iut.app;

import java.util.ArrayList;

public abstract class AbstractApplicationLog implements IApplicationLog {

	protected String message;
	protected ArrayList<IApplicationLogListener> listeners;
	
	public AbstractApplicationLog() {
		message = null;
		listeners = new ArrayList<IApplicationLogListener>();
	}
	
	@Override
	public abstract void setMessage(String message);
	
	  /** TP1 : Fonction venant de l'interface par héritage */
	@Override
	public String getMessage() {
		return message;
	}

	@Override
	public void addListener(IApplicationLogListener listener) {
		listeners.add(listener);

	}
	@Override
	public IApplicationLogListener[] getApplicationLogListeners() {
		return (IApplicationLogListener[])listeners.toArray();
	}
	/** Listener action */
	protected void fireMessage(String level, String message) {
		for (IApplicationLogListener listener_i : listeners) {
			listener_i.newMessage(level, message);
		}
	}
}