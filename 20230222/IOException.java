import java.io.IOException;

public class IOTest {

	public static void main(String[] args) {
		int ch = 0;
		try {
			while((ch = System.in.read()) != '\n') {    //키보드로부터 한사이드씩 읽어온다
					System.out.println((char) ch);
			}
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // 예외 상태메시지 출력하는 메소드
		}

	}

}
