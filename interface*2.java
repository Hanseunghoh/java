interface Printable{
	void print(String doc);
}

interface ColorPrintable extends Printable{ //Printable을 상속하는 인터페이스 
											//ColorPrintable 구현
	void PrintCMYK(String doc);
}

//S사의 컬러 프린터 드라이버
class Prn909Drv implements ColorPrintable{ // class로 메서드를 통해 구현한후 인터페이스에 대입
	@Override
	public void print(String doc) { //흑백 출력
		System.out.println("From MD-909 black & white ver");
		System.out.println(doc);
	}
	@Override
	public void PrintCMYK(String doc) {//컬러 출력
		System.out.println("From MD-909 CMYK ver");
		System.out.println(doc);
	}
	
}
public class PrinterDriver3 {

	public static void main(String[] args) {
		String myDoc = "This is a report about...";  //다음 문자열 출력할것임
		ColorPrintable prn = new Prn909Drv();       // 흑백으로 이동후 기술에 대입
											      //->기술이 클래스 메서드를 갖게됨
		prn.print(myDoc);                // 완성된 기술로 문자열 출력
		System.out.println();
		
		prn.PrintCMYK(myDoc);

	}

}
