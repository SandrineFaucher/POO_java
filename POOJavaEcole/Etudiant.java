package POOJavaEcole;

public class Etudiant {
    String nom;
    String prenom;
    int age;
    String matiereEtudiee;
    Boolean diplomeObtenu;



    // Constructeur 
    public Etudiant(String nomEtudiant, String prenomEtudiant, int ageEtudiant, String matiereEtudieeEtudiant, Boolean diplomeObtenuEtudiant) {
        nom            = nomEtudiant;
        prenom         = prenomEtudiant;
        age            = ageEtudiant;
        matiereEtudiee = matiereEtudieeEtudiant;
        diplomeObtenu  = diplomeObtenuEtudiant;
    }

    // Méthode sayHello
    public void sayHello() {
        System.out.println(
                "Bonjour, je m'appelle " + nom + " " + prenom + " j'ai " + age + " et j'étudie " + matiereEtudiee);
    }

    //Méthode isGraduated
    public void isGraduated(){
        if(diplomeObtenu = true){
            System.out.println("J'ai obtenu mon diplome");
        }else{
            System.out.println("Je ne suis pas encore diplomé(e)");
        }
    }

    //getter pour chaque attribut
    public String getNom() {
        return nom;
    }

    public String getPrenom(){
        return prenom;
    }

    public int getAge(){
        return age;
    }

    public String getMatiereEtudiee(){
        return matiereEtudiee;
    }

    public Boolean getDiplomeObtenu(){
        return diplomeObtenu;
    }

    //setter pour chaque attribut
    public void setNom(String newNom) {
        nom = newNom;
    }

    public void setPrenom(String newPrenom){
        prenom = newPrenom;
    }

    public void setAge(int newAge){
        age = newAge;
    }

    public void setMatiereEtudiee(String newMatiereEtudiee){
        matiereEtudiee = newMatiereEtudiee;
    }

    public void setDiplomeObtenu(Boolean newDiplomeObtenu){
        diplomeObtenu = newDiplomeObtenu;
    }
}
