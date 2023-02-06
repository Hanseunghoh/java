abstract class PersonalNumberStorage{
	public abstract void addPersonalInfo(String name, String perNum);
	public abstract String searchName(String perNum);
}

class PersonalNumInfo{
	String name;  //이름
	String number; //주민번호
	
	PersonalNumInfo(String name, String number){
		this.name = name;
		this.number = number;
	}
}

class PersonalNumberStorageImpl extends PersonalNumberStorage{
	PersonalNumInfo[] perArr;
	int numOfPerInfo;
	
	public PersonalNumberStorageImpl(int sz) { //생성자
		perArr = new PersonalNumInfo[sz]; //배열 
		numOfPerInfo = 0;
		
		public void addPersonalInfo(String name, String perNum){//재정의
			perArr[numOfPerInfo] = new PersonalNumInfo(name, perNum); //다른 클래스에서 값 받아와서 대입하고 싶을때 생성자 사용
			numOfPerInfo++;
		}
		
		public String searchName(String perNum) { //재정의
			for(int i=0; i<numOfPerInfo; i++) {
				if(perNum.compareTo(perArr[i].getNumber())==0)
					return perArr[i].getName();
			}
			return null;
		}
	}
}



public class AbstractInterface {

	public static void main(String[] args) {
		PersonalNumberStorage storage = new PersonalNumberStorageImpl(100);
		storage.addPersonalInfo("김기동", "950000-1122333");
		storage.addPersonalInfo("장신길", "970000-1122334");
		
		System.out.println(storage.searchName("950000-1122333"));
		System.out.println(storage.searchName("970000-1122334"));

	}

}
