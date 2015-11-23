package edu.iut.app;

public class ApplicationErrorLog extends AbstractApplicationLog {

	public ApplicationErrorLog() {
		super();
	}
	
	@Override
	public void setMessage(String message) {
		this.message = message;
		super.fireMessage("[ERROR]", this.message);
		
		for(int i = 0; i < listeners.size(); i++){
			listeners.get(i).newMessage("[ERROR]",message);
		}

	}
}
