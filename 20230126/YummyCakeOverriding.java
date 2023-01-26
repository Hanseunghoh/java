class cake{
	public void yummy() {
		System.out.println("Yummy Cake");
	}
}

class CheeseCake extends cake{
	public void yummy() { // cake의 yummy 메소드를 오버라이딩 함
		System.out.println("Yummy cheese Cake");
	}
}

public class YummyCakeOverriding {

	public static void main(String[] args) {
		cake c1 = new CheeseCake();
		CheeseCake c2 = new CheeseCake();
		
		c1.yummy();
		c2.yummy();

	}

}
