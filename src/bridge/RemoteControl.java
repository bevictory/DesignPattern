package bridge;

public abstract class RemoteControl {
	private ITV tv;
	public RemoteControl(ITV tv){
		this.tv = tv;
	}
	public void on(){
		tv.on();
	}
	public void off(){
		tv.off();
	}
	public void setChannel(int channel){
		tv.setChannel(channel);
	}

}
