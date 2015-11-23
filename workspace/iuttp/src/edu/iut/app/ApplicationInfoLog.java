package edu.iut.app;

public class ApplicationInfoLog extends AbstractApplicationLog {

	public ApplicationInfoLog() {
		super();
	}
	
	@Override
	public void setMessage(String message) {
		this.message = message;
		super.fireMessage("[INFO]", this.message);
		
		for(int i = 0; i < listeners.size(); i++){
			listeners.get(i).newMessage("[INFO]",message);
		}
	}
}