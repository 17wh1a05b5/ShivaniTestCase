package epamcom.Removechars;

public class RemoveChars {
	public static String Remove(String str){
		int len = str.length();
		String res = "";
		if(len == 0) {
			res = "";
		} else if(len == 1) {
			if(str.charAt(0) != 'A') {
				res = res + str.charAt(0);
			}
		} else {

			if(str.charAt(0) != 'A') {
				res = res + str.charAt(0);
			} if(str.charAt(1) != 'A') {
				res = res + str.charAt(1);
			}
			if(len > 2) {
				res = res + str.substring(2);
			}
		}
		return res;
	}
}