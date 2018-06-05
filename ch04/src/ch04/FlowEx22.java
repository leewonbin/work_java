package ch04;

public class FlowEx22 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
			System.out.println();
			
			
			// 향상된 for문 (JDK 1.5 버전부터 사용가능)
			// 형태 : for (타입 변수명 : 배열 또는 컬렉션)
			// 컬렉션은? 11장에서 설명
			for (int tmp : arr)  {
				System.out.printf("%d ", tmp);
			}
				System.out.println();
				System.out.println("sum=" + sum);
	}

}
