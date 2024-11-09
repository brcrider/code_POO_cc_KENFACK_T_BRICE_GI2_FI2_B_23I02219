class Compte{
    private double solde;
    private double taux;

    public Compte(double solde, double taux){
        this.solde= solde;
        this.taux= taux;
    }

    public void nouveausolde(){
        solde+= solde * taux;
    }
    public double getnouveausolde(){
        return solde;
    }
    
}

class Client{
    private String nom;
    private String ville;
    private Compte Compteprive;
    private Compte CompteEpargne;

    public Client(String nom, String ville, double soldeprive, double soldeEparne, double tauxprive, double tauxEpargne){
        this.nom= nom;
        this.ville= ville;
        this.Compteprive= new Compte(soldeprive, tauxprive);
        this.CompteEpargne= new Compte(soldeEparne, tauxEpargne);

    }
    public void Afficher(){
        
        System.out.println("Client: "+nom+" de "+ville);
        System.out.println("Compte prive: "+Compteprive.getnouveausolde()+" francs");
        System.out.println("Compte Epargne: "+CompteEpargne.getnouveausolde()+" francs");
    }
    public void boucleCompte(){
        Compteprive.nouveausolde();
        CompteEpargne.nouveausolde();
    }

}
public class Banque2 {
    public static void main(String[] args) {
        
        Client client1= new Client(" \n Pedro", "Geneve", 1000.0, 2000.0, 0.01, 0.02);
        Client client2= new Client("Alexandra", "Lausanne", 3000.0, 4000.0, 0.01, 0.02);
        System.out.println("\n Informations du client avant que le compte ne soit bouclé");
        client1.Afficher();
        client2.Afficher();

        client1.boucleCompte();
        client2.boucleCompte();
        System.out.println("\n Informations du client apres le bouclement du compte");
        client1.Afficher();
        client2.Afficher();

        
    }
}
