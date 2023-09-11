package Humains;

public class Humain {
    // variables d'instance
    String nom;
    String prenom;
    int age;
    double taille;
    double poids;
    int annee;
    String pays;

    // constructeur 1
    public Humain(String nomHumain, String prenomHumain, int ageHumain) {
        nom = nomHumain;
        prenom = prenomHumain;
        age = ageHumain;
    }

    // constructeur 2
    public Humain(String nomHumain, String prenomHumain, int ageHumain, double tailleHumain,
            double poidsHumain, int anneeHumain, String paysHumain) {
        nom = nomHumain;
        prenom = prenomHumain;
        age = ageHumain;
        taille = tailleHumain;
        poids = poidsHumain;
        annee = anneeHumain;
        pays = paysHumain;
    }

    // méthode "sayHello"
    public void sayHello() {
        System.out.println("Bonjour, je m'appelle " + nom + prenom);
    }

    // méthode sayEverything
    public void sayEverything() {
        System.out.println("Bonjour je m'appelle " + prenom + " " + nom + ", j'ai " + age + " ans, je pèse " + poids
                + " Kg, je mesure " + taille + " cm, je suis né(e) en " + annee + " et je viens de " + pays);

    }

    // getter pour récupérer le pays
    public String getPaysHumain() {
        return pays;
    }

    // getter pour récupérer le poids
    public double getPoids() {
        return poids;
    }

    // setter pour modifier le poids
    public void setPoids(double newPoidsHumain) {
        poids = newPoidsHumain;
    }

    // getter pour récupérer la taille
    public double getTaille(){
        return taille;
    }
    // setter pour modifier la taille
    public void setTaille(double newTailleHumain){
        taille = newTailleHumain;
    }

    // getter pour récupérer la l'annee de naissance
    public int getAnnee(){
        return annee;
    }
    // setter pour modifier l'annee de naissance
    public void setAnnee(int newAnneeHumain){
        annee = newAnneeHumain;
    }

    // getter pour récupérer le pays
    public String getPays(){
        return pays;
    }
    // setter pour modifier le pays
    public void setPays(String newPaysHumain){
        pays = newPaysHumain;
    }


}

