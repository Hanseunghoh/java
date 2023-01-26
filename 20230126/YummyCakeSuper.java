class Cake{
	public void yummy() {
		System.out.println("Yummy cake");
	}
}

class CheeseCake extends Cake{
	public void yummy() {
		super.yummy();
		System.out.println("Yummy Cheese Cake");
	}
	public void tasty() {
		super.yummy();
		System.out.println("Yummy Tasty Cake");
	}
}

public class YummyCakeSuper {

	public static void main(String[] args) {
		CheeseCake cake = new CheeseCake();
		cake.yummy();
		cake.tasty();
			
		}

	}
