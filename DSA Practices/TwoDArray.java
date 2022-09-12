package practice.array.java;

public class TwoDArray {
	public static void main(String[] args) {
	
		int [][] elementsOfTwoDArray = new int[3][4];
		int count = 1;
		for(int i = 0; i<elementsOfTwoDArray.length; i++) {
			for(int j =0; j<elementsOfTwoDArray[i].length;j++) {
				elementsOfTwoDArray[i][j] = count;
				count++;
			}
			
		}
		System.out.println(elementsOfTwoDArray[2].length);
		
		for(int i=0;i<elementsOfTwoDArray.length;i++) {
			for(int j=0; j<=elementsOfTwoDArray.length; j++) {
				System.out.print(elementsOfTwoDArray[i][j] + " ");
			}
			System.out.println(" ");
		
		}
	}
}
