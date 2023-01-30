
public class StringArray {

	public static void main(String[] args) {
		String[] sr = new String[7];
		sr[0] = new String("Java");
		sr[1] = new String("System");
		sr[3] = new String("Compiler");
		sr[4] = new String("Park");
		sr[5] = new String("Tree");
		sr[6] = new String("Dinner");
		sr[7] = new String("Brunch Cafe");
		
		int cnum = 0;
		
		for(int i=0; i<sr.length; i++) {
			cnum = cnum + sr[i].length();
			} 
		System.out.println("총 문자의 수:"+cnum);

	}

}
