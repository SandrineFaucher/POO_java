package POOJavaEcole;

public class Etudiant {
    String nom;
    String prenom;
    int age;
    String matiereEtudiee;
    Boolean diplomeObtenu;

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

}
