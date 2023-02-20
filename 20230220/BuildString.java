
public class BuildString {

	public static void main(String[] args) {
		//문자열 "123"이 저장된 인스턴스 생성
		StringBuilder stbuf = new StringBuilder("123");  // String+Buffer   StringBuffer와 같음 (추가,수정,삭제 등 다양한 메서드 존재)하는 클래스
	
		stbuf.append(45678); //문자열 덧붙이기
		
		System.out.println(stbuf.toString()); //문자열로 바꿔줌
		
		stbuf.delete(0, 2); //문자열 일부 삭제   0시작 2미만까지
		System.out.println(stbuf.toString());
		
		stbuf.replace(0, 2, "AB"); //문자열 일부 교체 0시작 2미만까지
		System.out.println(stbuf.toString());
		
		stbuf.reverse(); //문자열 내용 뒤집기
		System.out.println(stbuf.toString());
		
		String sub = stbuf.substring(2,4); //일부만 문자열로 변환
		System.out.println(sub);

	}

}
