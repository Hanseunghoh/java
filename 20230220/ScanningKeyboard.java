import java.util.Scanner;

public class ScanningKeyboard {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); // new Scanner 클래스 불러오려면 생성자 함수에 대입 후 호출
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int num3 = sc.nextInt();
	
	int sum = num1+num2+num3;
	System.out.printf("%d+%d+%d=%d\n, num1,num2,num3,sum");

	}

}
