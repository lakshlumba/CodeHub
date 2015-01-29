package practice;

public class StringReversal {
	public static void main(String[] args) {
		String str = "123456789";
		String str2 = "";
		for (int i = (str.length()-1); i >= 0; i--) {
			str2 = str2 + str.charAt(i);
		}
		System.out.println(str2);
	}

}
