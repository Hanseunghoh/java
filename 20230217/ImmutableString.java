                
public class ImmutableString {

	public static void main(String[] args) {
		String str1 = "Simple String";
		String str2 = "Simple String";
		
		String str3 = new String("Simple String"); //String틀로 str3만들것 = "Simple String"내용을 새로운 String틀에 넣은것을 str3에 대입
		String str4 = new String("Simple String"); //String틀로 str4만들것 = "Simple String"내용을 새로운 String틀에 넣은것을 str4에 대입
		
		if(str1==str2) {
			System.out.println("str1과 str2는 동일 인스턴스 참조");
			
		}
			else {
				System.out.println("str1과 str2는 다른 인스턴스 참조");
			}
		if(str3==str4) {
			System.out.println("str3과 str4는 동일 인스턴스 참조");
		}
		else {
			System.out.println("str3과 str4는 다른 인스턴스 참조");
		}
		
	}

}

//String x = "Simple String" 문자열 변수 
//String x1 = new String("Simple String") 인스턴스(결과물)
//String x2 = new String("Simple String") 인스턴스(결과물)
