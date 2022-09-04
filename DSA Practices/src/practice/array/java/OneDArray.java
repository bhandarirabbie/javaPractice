package practice.array.java;

public class OneDArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] elementsOfArray = new int[9];
		int count = 1;
		for(int i = 0; i<elementsOfArray.length;  i++) {
			elementsOfArray[i] = count;
			count++;
		System.out.print(elementsOfArray[i] + " ");
		}
	}
}
