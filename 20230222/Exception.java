class CarException extends Exception{
	//독자적인 예외 클래스를 선언
}

class Car{					
	private int num;
	private double gas;
	
	public Car() {
		num = 0;
		gas = 0.0;
		System.out.println("자동차가 만들어졌습니다");
	}
	public void setCar(int n, double g) throws CarException{ //예외를 던질(발생)하는메소드
		if(g<0) {
			CarException e = new CarException(); //main에서 받은값이 음수일때 CarException 예외 인스턴스 생성
			throw e; //특정상황에서 예외를 던진다
		}
		else {
			num = n;
			gas = g;
			System.out.println("차량 번호를"+num+"으로 연료방을"+gas+"로 바꾸었습니다");
		}
	}
	public void show() {
		System.out.println("차량 번호는"+num+"입니다");
		System.out.println("차량 번호는"+gas+"입니다");
	}
}

public class Sample5 {

	public static void main(String[] args) {
		Car car1 = new Car();		//생성자에 print값 넣었기때문에 출력가능 
		try {
			car1.setCar(1234,-10.0); //1234,-10.0을 넣었을때 예외발생시킬 함수 불러옴
		}
		catch(CarException e) {
			System.out.println(e+"(이)가 던져졌습니다");
		}
		car1.show();
	}

}
