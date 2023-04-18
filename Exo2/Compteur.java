public class Compteur {

	int totaliseur;
	int partiel;
	public final int MAX = 1000;

	public Compteur(){
		System.out.println(this);
	}

	public int getTotaliseur(){
		return this.totaliseur;
	}

	public int getPartiel(){
		return this.partiel;
	}

	public void resetPartiel(){
		this.partiel = 0;
	}

	public void resetOrNot(){
		if(this.partiel >= this.MAX) this.resetPartiel();
	}

	public void ajouter(double x){
		this.totaliseur += x;
		this.partiel += x;
		this.resetOrNot();
	}

	@Override
	public String toString(){
		return(
			"Compteur = [ totaliseur = " + this.totaliseur + " | partiel = " + this.partiel + " ]"
		);
	}

}