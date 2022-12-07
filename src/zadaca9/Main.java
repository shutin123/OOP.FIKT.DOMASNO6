package zadaca9;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main (String[] args) {

		List<Fakultet> fakulteti = new ArrayList<Fakultet>();

		fakulteti.add(new Fakultet ("FIKT      ", 2, 200));
		fakulteti.add(new Fakultet ("Tehnicki  ", 10, 1950));
		fakulteti.add(new Fakultet ("FINKI     ", 4, 2000));
		fakulteti.add(new Fakultet ("Pedagoski ", 2, 150));
		fakulteti.add(new Fakultet ("Praven", 1, 200));

		System.out.println("Elementi na listat se: ");
		for (int i=0; i<fakulteti.size(); i++) {
			System.out.print("Fakultet: " + fakulteti.get(i).getIme());
			System.out.print("|| Broj na smerovi: " + fakulteti.get(i).getBrNaSmerovi());
			System.out.println("|| Broj na studenti: " + fakulteti.get(i).getVkStudenti());
		}
	}
}
