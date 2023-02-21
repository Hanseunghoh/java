
public class sample3 {

	public static void main(String[] args) {
		try {
			int[] test;
			test = new int[5];
			
			System.out.println("test[10]에 값을 대입합니다");
			test[10] = 80;
			System.out.println("test[10]에 80을 대입했습니다");
		}
		catch(ArrayIndexOutOfBoundsException e) {  //예외클래스 변수명 예외 발생했을때 실행할 코드
			System.out.println("배열 길이를 넘어섰습니다");
		}
		finally {  //예외발생 유무에 관계없이 finally 블록이 선언된 메소드의 마지막에 반드시 실행
			System.out.println("마지막에 반드시 이 코드가 실행됩니다");
			
		}
		System.out.println("무사히 종료했습니다");

	}

}
