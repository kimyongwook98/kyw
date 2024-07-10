package ch13.m3;

public class FootballPlayer implements Player<Football>{
	Football football;
	
	@Override
	public Football get() {
		return football;
	}
	
	@Override
	public void set(Football football) {
		this.football = football;
	}
	
	@Override
    public void run() {
		football.run();
	}
	
	
	@Override
    public void stop() {
		football.stop();
	}
}
