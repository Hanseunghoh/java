
public class TwoDimenArray2 {

	public static void main(String[] args) {
		int[][] arr = new int[3][4];
		int num = 1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = num;
				num++;
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t"); 
			} // -> 가로줄 배열 생성됨
			System.out.println(); // -> 가로줄 완성된 후 \n 
			
		}

	}

}
