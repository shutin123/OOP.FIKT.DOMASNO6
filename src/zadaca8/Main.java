package zadaca8;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main (String[] args) {
		List<String> mail = new ArrayList<>();

		for (int i = 5; i<21; i+=5) {
			mail.add("mail" + i + "@yahoo.com");
		}

		System.out.println("Elementi na listata se: " + mail);
	}
}
