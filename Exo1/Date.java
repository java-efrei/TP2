public class Date {

    private int jour;
    private int mois;
    private int annee;

    public Date(){}

    public Date(int jour, int mois, int annee){
        jour = jour;
        mois = mois;
        annee = annee;
    }

    @Override
    public String toString() {
        return "DateduJour{" +
        "jour=" + jour +
        ", mois=" + mois +
        ", annee=" + annee +
        '}';
    }

    public boolean equals(Date o) {
        return this == o;
    }

    public int getJour(){ return this.jour; }
    public int getMois(){ return this.mois; }
    public int getAnnee(){ return this.annee; }

    public void setJour(int j){ this.jour = j; }
    public void setMois(int m){ this.mois = m; }
    public void setAnnee(int a){ this.annee = a; }

}
