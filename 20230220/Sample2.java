import java.io.*;

public class Sample5 {

	public static void main(String[] args) throws IOException {
		System.out.println("정수 2개 입력하십시오");
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine(); //한줄 읽는다 // 쓰는칸
		String str2 = br.readLine(); //한줄 읽는다 // 쓰는칸
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		int ans = Math.max(num1, num2);
		
		System.out.println(num1+"와"+num2+"중 큰 쪽은"+ans+"입니다");

	}

}
