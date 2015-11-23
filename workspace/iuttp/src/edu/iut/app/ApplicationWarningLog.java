package edu.iut.app;

public class ApplicationWarningLog extends AbstractApplicationLog {

	public ApplicationWarningLog() {
		super();
	}
	
	@Override
	public void setMessage(String message) {
		this.message = message;
		super.fireMessage("[WARNING]", this.message);
		
		for(int i = 0; i < listeners.size(); i++){
			listeners.get(i).newMessage("[WARNING]",message);
		}
	}
}
