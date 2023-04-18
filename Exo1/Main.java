public class Main {

    public static void main(String[] args){
        Date d1 = new Date();
        d1.setJour(27);
        d1.setAnnee(2022);
        System.out.println("La date d1 est = " + d1);
        Date d2 = new Date(2021, 3, 20);
        System.out.println("La date d2 est = " + d2) ;
        System.out.println("Le jour de d2 est : " + d2.getJour());
    }
    
}