package basicjava;

public class NestedLoop {

	public static void main(String[] args) {
		for(int i = 1; i<8;i++) {
			for(int j = 1; j<8; j++) {
				if(j<=i) {
					System.out.print(i);
				}
			}
			System.out.println("");
		}
	}
}
