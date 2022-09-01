package paint;

public class IntegerToRomanAddingM {
	public static void intToRoman(int num){  
		
System.out.println("Integer: " + num);  

int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};  
String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};  

StringBuilder roman = new StringBuilder();  

for(int i=0;i<values.length;i++){  
while(num >= values[i]){  
num = num - values[i];  
roman.append(romanLetters[i]);  
	}  
}  
System.out.println("Corresponding Roman Numerals is: " + roman.toString());  
	}  
public static void main(String args[]){  
intToRoman(1);  
intToRoman(252);  
intToRoman(1000);  
intToRoman(12910);  
	}  
}  
