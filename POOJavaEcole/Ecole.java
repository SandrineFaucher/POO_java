package POOJavaEcole;


public class Ecole {
    String nom;
    String[] matieresEnseignees;
    String ville;
    Etudiant[] etudiants;


    //constructeur 
    public Ecole(String nomEcole, String[] matieresEnseigneesEcole , String villeEcole, Etudiant[] etudiantsEcole ){
        nom                = nomEcole;
        matieresEnseignees = matieresEnseigneesEcole;
        ville              = villeEcole;
        etudiants          = etudiantsEcole;
    }

    //methode showInformations
    public void showInformations(){
        System.out.println("Bienvenue à l'école " + nom + " située à " + ville + " et proposant : ");
        for(String matiereEnseignee : matieresEnseignees){
            System.out.println(matiereEnseignee);
        }

    }

    //getter pour tous les attributs 
    public String getNom() {
        return nom;
    }

    public String[] getMatieresEnseignees(){
        return matieresEnseignees;
    }

    public String getVille(){
        return ville;
    }

    public Etudiant[] getEtudiants(){
        return etudiants;
    }

    // setter pour tous les attributs 
    public void setNom(String newNom){
        nom = newNom;
    }

    public void setMatieresEnseignees(String[] newMatieresEnseignees){
        matieresEnseignees = newMatieresEnseignees;
    }

    public void setVille(String newVille){
        ville = newVille;
    }

    public void setEtudiant(Etudiant[] newEtudiants){
        etudiants = newEtudiants;
    }

}
