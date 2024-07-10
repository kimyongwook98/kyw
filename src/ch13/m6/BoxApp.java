package ch13.m6;




public class BoxApp {
	public static void main(String[] args) {
		Box<Integer, Double> integerDoubleBox = new Box<>();
		
		integerDoubleBox.printInfoGeneric(1, 1.1);
		integerDoubleBox.printInfoGeneric(20, "hello");
		integerDoubleBox.printInfoGeneric("좋아요", "good");
	}
}
