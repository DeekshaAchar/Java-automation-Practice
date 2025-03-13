package experiments;

import java.util.Date;

public class GenerateEmailDemo {

	public static void main(String[] args) {
//		String dateString = new Date().toString();
		String noSpaceDateString = new Date().toString().replaceAll("\\s", "");
		String noSpace = noSpaceDateString.replaceAll("\\:", "");
		String emailStamp = noSpace+"@gmail.com";
		System.out.println(emailStamp);
	}

}
