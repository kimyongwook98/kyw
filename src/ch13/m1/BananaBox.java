package ch13.m1;

public class BananaBox implements IBox<Banana>{
	private Banana banana;

	@Override
	public Banana get() {
		return banana;
	}
	
	@Override
	public void set(Banana banana) {
		this.banana = banana;
	}
	
	
}
