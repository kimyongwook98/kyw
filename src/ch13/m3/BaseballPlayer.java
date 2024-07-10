package ch13.m3;


public class BaseballPlayer implements Player<Baseball>{
	Baseball baseball;
	
	@Override
	public Baseball get() {
		return baseball;
	}
	
	@Override
	public void set(Baseball baseball) {
		this.baseball = baseball;
	}
	
	@Override
    public void run() {
		baseball.run();
	}
	
	
	@Override
    public void stop() {
		baseball.stop();
	}
	
}
