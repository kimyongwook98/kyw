package ch05;

public class charAt {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		String str1 = "ABCDEFG";
		String str2 = "abcdefg";
		String str3 = "		자바 프로그래밍	";
		
		// # charAt(index)
		// 인덱스 위치의 글자 리턴
		
		System.out.println("\"ABCDEFG\".charAt(1)=" + str1.charAt(1));
	}

}
