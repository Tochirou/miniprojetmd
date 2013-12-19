package partie1;

public class JeuHanoi {
	private int	nbDisques;

	public JeuHanoi(int nbDisques) {
		this.setNbDisques(nbDisques);
	}

	public static void hanoi(int n, String from, String temp, String to) {
		if (n == 0)
			return;
		hanoi(n - 1, from, to, temp);
		System.out
				.println("Bouger le disque " + n + " de " + from + " à " + to);
		hanoi(n - 1, temp, from, to);
	}

	public int getNbDisques() {
		return nbDisques;
	}

	public void setNbDisques(int nbDisques) {
		this.nbDisques = nbDisques;
	}

	public static void main(String args[]) {
		int argumentNbDisque = Integer.parseInt(args[0]);
		JeuHanoi jh = null;
		if (argumentNbDisque < 0 || argumentNbDisque > 50) {
			System.out.println("La valeur entrèe est incorrecte.");
		} else {
			jh = new JeuHanoi(argumentNbDisque);
		}
		hanoi(jh.getNbDisques(), "A", "B", "C");

	}
}
