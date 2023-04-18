public class Vehicule {

	private static int registre;
	public int imm;
	Compteur c;
	final int capacity = 50;
	private int jauge;
	private double consommation;

	public Vehicule(int consommation){
		this.consommation = consommation;
		this.imm = registre;
		registre++;
	}

	public void getCompteur(){
		System.out.println(c);
	}

	public int getJauge(){
		return this.jauge;
	}

	public void faireLePlein(){
		this.jauge = this.capacity;
	}

	public void remplir(int q){
		this.jauge += q;
		if(this.jauge > this.capacity) this.faireLePlein();
		System.out.println(c);
	}

	public void rouler(int x){
		if(this.jauge - (this.consommation*x)/100 < 0){
			c.ajouter((this.jauge * 100)/this.consommation);
			System.out.println("Le vehicule " + this.imm + " a parcouru " + (this.jauge * 100)/this.consommation);
			this.jauge = 0;
		}
		else {
			c.ajouter(x);
			System.out.println("Le vehicule " + registre + " a parcouru " + x);
			this.jauge -= (this.consommation*x)/100;
		}
	}



	@Override
	public String toString(){
		return "Compteur = [ totaliseur = " + c.getTotaliseur() + " | partiel = " + c.getPartiel() + " ] ;; jauge = " + this.jauge;
	}

}