class InstCnt{
	static int instNum = 100;
	
	InstCnt(){
		instNum++;
		System.out.println("인스턴스 생성:"+instNum);
	}
}
public class OnlyClassNolnstance {

	public static void main(String[] args) {
		InstCnt.instNum -=15; // 인스턴스 생성 없이 instNum에 접근가능(틀만 만들고 객체(인스턴스) 아직 안만든상태에서 접근 가능하다는뜻
                          // 클래스 변수는 인스턴스의 영향을 받지않으므로 인스턴스(객체) 만들기 전에 

	}

}
