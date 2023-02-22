
public class ArrayExcTry {

	public static void main(String[] args) {
		int[]arr = new int[3];
		int i;
		String str = null;
		try {
			for(i=0; i<3; i++) {
				arr[i] = i;
			}
			for(i=0; i<3; i++) {
				System.out.println(arr[i]);
			}
			i = 4/0; //예외 발생
		}

	}

}


// 예외 발생하기전까지 코드 실행되고 예외된부분부터 오류나옴
