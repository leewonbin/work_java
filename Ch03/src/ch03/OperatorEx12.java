package ch03;

public class OperatorEx12 {
	public static void main(String[] args) {
		char c1 = 'a';			// c1에는 문자 'a'의 콛값인 97이 저장된다.
		char c2 = c1;			// c1에 저장되어 있는 값이 c2에 저장된다.
		char c3 =' ';				// c3에 공백으로 초기화 한다.
		
		int i = c1 + 1;			// 'a'+1 -> 97+1 -> 98
		
		c3 = (char) (c1 + 1);		// c1 + 1 -> 97 + 1 -> 98 -> 'b'
		c2++;							// 98 -> 'b'			//98은 b의 아스킨 코드값
		c2++;							// 99-> 'c'			// 99는 c의 아스킨 코드값
		
		System.out.println("i=" + i);
		System.out.println("c2=" + c2);
		System.out.println("c=3" + c3);
	
	}

}
