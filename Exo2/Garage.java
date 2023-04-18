public class Garage {

	private Vehicule[] vehicules = new Vehicule[10];

	public void ajouterVehicule(Vehicule v){
		this.vehicules[v.imm] = v;
	}

	@Override
	public String toString(){
		String chaine = "";
		for(int i=0; i<vehicules.length; i++){
			chaine += "Compteur = [ totaliseur = " + vehicules[i].c.getTotaliseur() + " | partiel = " + vehicules[i].c.getPartiel() + " ] ;; jauge = " + vehicules[i].getJauge() + "\n";
		}
		return chaine;
	}

}