package ch16.m2;


public class App {
		public static void main(String[] args) {
			
			System.out.println("==Type1==");
			
			IDrawable drawable = new IDrawable() {
				
				@Override
				public void draw() {
					System.out.println("동글뱅이");
				}
			};
			drawable.draw();
			
			
			
			
			System.out.println("==Type2==");
			
			IDrawable drawable2 = new IDrawable() {
				
				@Override
				public void draw() {
					System.out.println("삼각형");
					System.out.println("사각형");
				}
			};
			drawable2.draw();
			
			
			
			
			
			
			System.out.println("\n==lambda==");
			
			System.out.println("==type1==");
			// 실행문 1개
			
			IDrawable drawable3 = () -> {
				System.out.println("동글뱅이");
			};
			drawable3.draw();
			
			
			
			
			System.out.println("\n==type2==");
			// 실행문 2개
			IDrawable drawable4 = () -> {
				System.out.println("삼각동생");
				System.out.println("사각동생");
			};
			drawable4.draw();
			
		}
}
