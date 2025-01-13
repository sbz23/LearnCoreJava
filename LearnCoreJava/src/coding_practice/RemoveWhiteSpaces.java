package coding_practice;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String s = "Java programming and selenoium automation ";
		s = s.replaceAll("\\s", "");
		System.out.println(s);

	}

}
