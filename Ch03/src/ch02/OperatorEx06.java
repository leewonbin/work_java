package ch02;

public class OperatorEx06 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		//byte c = a + b; 컴파일 에러 발생, 명시적 형변환 필요
		byte c = (byte)(a+b);
		System.out.println(c);

	}

}
