class Circle{
	static final double PI = 3.1415;  // 변하지 않는, 참조가 목적인 값
	private double radius;
	
	Circle(double rad){  // 반지름이 1.2인 것을 그 객체의 생성자로 사용
		radius = rad;
	}
	void showPerimeter() {
		double peri = (radius * 2) * PI;
		System.out.println("둘레:"+peri);
	}
	void showArea() {
		double area = (radius * radius) *PI;
		System.out.println("넓이:"+area);
	}
}


public class CircleConstPI {

	public static void main(String[] args) {
		Circle c = new Circle(1.2);  //반지름이 1.2에 대한 원을 만들것, Circle 틀을 이용해 c를 만들것
		c.showPerimeter();
		c.showArea();

	}

}
