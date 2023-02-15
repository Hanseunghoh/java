interface PersonalNumberStorage{
	void addPersonalInfo(String name, String perNum);
	String searchName(String perNum);
}

class PersonalNumInfo{   // name 과 number 구성을 대입시켜주려고 만듬
	String name;
	String number;
	
	PersonalNumInfo(String name, String number){  //생성자를 다른 클래스에서 사용
		this.name = name;
		this.number = number;
	}
	String getName() {
		return name;
	}
	String getNumber() {
		return number;
	}
}
class PersonalNumberStorageImpl implements PersonalNumberStorage{
	PersonalNumInfo[] perArr;
	int numOfperInfo;
	
	PersonalNumberStorageImpl(int sz){
		perArr = new PersonalNuminfo[sz];  // perArr 객체초기화 2번 //100개짜리 perArr 생성
		numOfperInfo = 0;
	}
	public void addPersonalInfo(String name, String perNum) {	
		perArr[numOfperInfo] = new PersonalNumInfo(name, perNum); //앞 class의 생성자
																  //1개짜리 perArr가 PersonalNumInfo(name, perNum)으로 구성될것임
																  // perArr 구성(name과 perNum) 만들어줌 
		numOfperInfo++;            //생성자 = 객체명  // 인스턴스에 생성자 대입 = 인스턴스에 객체를 넣는것 //객체내용을 넣어줄때 사용
	}
	public String searchName(String perNum) {
		for(int i=0; i<numOfPerInfo; i++) {
			if(perNum.compareTo(perArr[i].getName())==0)
				return perArr[i].getName();
		}
		return null;
	}
	
	public String search name(String perNum)
	
}
}



public class AbstractInterface2 {

	public static void main(String[] args) {
		PersonalNumberStorage storage = new PersonalNumberStorageImpl(100);
		storage.addPersonalInfo("김기동","95000-1122333");
		storage.addPersonalInfo("장산길","970000-1122334");
		
		System.out.println(storage.searchname("950000-1122333"));
		System.out.println(storage.searchname)("970000-1122334");

	}

}

//main에 객체 인스턴스에 100개 대입할것임 -> 100개에 관한(생성자로) 클래스 만든후 그 클래스를 인스턴스에 대입
//interface 할 클래스의 인스턴스에 name과 number로 구성할거로 만들기 -> name 과 number로 관한(생성자로) 클래스 만들기
