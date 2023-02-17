class SimpleBox{
	private int data;
	SimpleBox(int data){
		this.data = data;  //this = 클래스 내부에 있는것 ,()안 data는 클래스 밖 main에있다
	}
	void setData(int data) { //this=클래스 내부에있는것  ,()안 data는 클래스 밖 main에있다
		this.data = data;	 // main에서 받은것을 데이터로 설정
	}
	int getData() {			 // 설정된 값을 받을것 main에 넘겨줄것
		return this.data;
	}
}
public class ThisInst {

	public static void main(String[] args) {
		SimpleBox box = new SimpleBox(99); //SimpleBox틀에 99를넣은걸로 인스턴스에 넣음
		System.out.println(box.getData()); // 1.99넣은 값을 불러오기 2.아직77값이 들어가기전임
		box.setData(77);					 // 77을 데이터 설정
		System.out.println(box.getData());   // 설정된 데이터값 불러오기
	}

}

//객체 값 출력되면 함수 종료됨
