package coding_practice;

public class RemoveJunkCharacters {

	public static void main(String[] args) {
		String s ="Abc123!@#XyZ456$%^";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
