abstract class PersonalNumberStorage{
	public abstract void addPersonalInfo(String name, String perNum);
	public abstract String searchName(String perNum);
}

class PersonalNumInfo{
	String name;
	String number;
	
	PersonalNumInfo(String name, String number){  //name과 number로 구성되는것 클래스로 만들기 
												  // name number 연관된것 생성자로
												  
		this.name = name;
		this.number = number;
	}
	String getName() {return name;}         // 입력한것 출력
	String getNumber() {return number;}     // 입력한것 출력
}

class PersonalNumberStorageImpl extends PersonalNumberStorage{
	PersonalNumInfo[] perArr;
	int numOfPerInfo;
	
	public PersonalNumberStorageImpl(int sz) {  //100개 관련된 클래스 만들기
												//100개 연관된건 생성자로
		perArr = new PersonalNumInfo[sz];
		numOfPerInfo = 0;
	}
	
	public void addPersonalInfo(String name, String perNum) {
		perArr[numOfPerInfo] = new PersonalNumInfo(name, perNum);
		//perArr에 name과 number을 대입해 name 과 number가 들어있는 perArr만들기
		numOfPerInfo++;
	}
	public String searchName(String perNum) {
		for(int i=0; i<numOfPerInfo; i++) {
			if(perNum.compareTo(perArr[i].getNumber())==0)
				return perArr[i].getName();
		}
		return null;
	}
}

public class AbstractInterface {

	public static void main(String[] args) {
		PersonalNumberStorage storage = new PersonalNumberStorageImpl(100);
		//100개 짜리로 만들것임
		storage.addPersonalInfo("김기동","950000-1122333");
		storage.addPersonalInfo("장산길", "970000-1122333");
		
		System.out.println(storage.searchName("960000-1122333"));
		System.out.println(storage.searchName("970000-1122334"));

	}

}
