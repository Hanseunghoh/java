interface Printable { //MS가 정의하고 제공한 인터페이스 (기술)
	public void print(String doc);
}

class SPrinterDriver implements Printable{ //S사가 정의한 클래스(S사의 기술)
	@Override
	public void print(String doc) {  
		System.out.println("From Samsung printer");
		System.out.println(doc);
		};
	}

class LPrinterDriver implements Printable{ //L사가 정의한 클래스(L사의 기술)
	@Override
	public void print(String doc) {
		System.out.println("From LG printf");
		System.out.println(doc);
	}
}


public class PrinterDriver {

	public static void main(String[] args) {
		String myDoc = "This is a reprot about...";
		
		//삼성 프린트로 출력	
		Printable prn = new SPrinterDriver(); // -> SPrinterDriver로부터 기술 구현할것
		prn.print(myDoc);
		System.out.println();
		
		//LG 프린터로 출력
		prn = new LPrinterDriver();  // -> LPrinterDriver로부터 기술 구현할것
		prn.print(myDoc);
		
	}

}
