package basicjava;


public class PrintAString {

	public static void main(String[] args) {
		
		printStrings("abc" , 5);	
		
	}
	
	public static void printStrings(String str , int n) {

		for(int i=0;i<n;i++) {
			System.out.print(str);
		}
		
	}
		
}



