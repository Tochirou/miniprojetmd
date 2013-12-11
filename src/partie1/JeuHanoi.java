package partie1;

public class JeuHanoi {
	private int	nbDisques;

	public JeuHanoi(int nbDisques) {
		this.setNbDisques(nbDisques);
	}
	
	
	

	public int getNbDisques() {
		return nbDisques;
	}

	public void setNbDisques(int nbDisques) {
		this.nbDisques = nbDisques;
	}

	public static void main(String args[]) {
		int argumentNbDisque = Integer.parseInt(args[0]);
		JeuHanoi jh;
		if (argumentNbDisque < 0 || argumentNbDisque > 50) {
			System.out.println("La valeur entrèe est incorrecte.");
		} else {
			jh = new JeuHanoi(argumentNbDisque);
		}

	}
}
