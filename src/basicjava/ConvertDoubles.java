package basicjava;

public class ConvertDoubles {

	public static void main(String[] args) {
		double dNum = 4.5;
		int num = (int)dNum;
		System.out.println(num*2);
		String test = "" + dNum;
		System.out.println(test + 2);
		char ch = ("" + dNum).charAt(1);
		System.out.println(ch);

	}

}
