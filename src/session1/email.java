package session1;

import java.util.ArrayList;

public class email {
	public static void main(String[] args) {
		
		ArrayList<String> emailID = new ArrayList<String>();

		emailID.add("sunitha@gmail.com");
		emailID.add("pranitha@gmail.com");
		emailID.add("anitha@gmail.com");
		emailID.add("mahesh@gmail.com");
		emailID.add("madhuri@gmail.com");
		emailID.add("mahi@gmail.com");
		emailID.add("iswarya@gmail.com");

		String searcElement = "sunitha@gmail.com";

		for (int i = 0; i < emailID.size(); i++) {

			if (searcElement == emailID.get(i)) {

				System.out.println("\n");

				System.out.println("email ID " + searcElement + " found");

				break;

			}
		}

	}
}