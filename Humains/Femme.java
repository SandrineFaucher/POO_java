package Humains;

public class Femme extends Humain {
    //variables d'instance
    
    String magazinePrefere;

    //constructeur 1
    public Femme(String nomFemme, String prenomFemme, int ageFemme){
     super(nomFemme, prenomFemme, ageFemme);

     };
    
    //constructeur 2
    public Femme(String nomFemme, String prenomFemme, int ageFemme, double tailleFemme,
    double poidsFemme, int anneeFemme, String paysFemme, String magazinePrefereFemme){
     
     super(nomFemme, prenomFemme, ageFemme, tailleFemme, poidsFemme, anneeFemme, paysFemme);
      magazinePrefere = magazinePrefereFemme;  
     
    };

    // méthode "sayHello"
    @Override   // lorsqu'on redéfinie une méthode on dit qu'on la surcharge
    public void sayHello(){
        System.out.println("Je m'appelle " + nom + " " + prenom + ", je suis une femme et j'ai " +
        age + "ans.");
    }

    // méthode sayEverything
    @Override
    public void sayEverything() {
        System.out.println("Bonjour je m'appelle " + prenom + " " + nom + ", j'ai " + age + " ans, je pèse " + poids
                + " Kg, je mesure " + taille + " cm, je suis né(e) en " + annee + " et je viens de " + pays
                + " mon equipe préférée est : " + magazinePrefere);

    }
    
    //getter pour récupérer le magazine préféré
    public String getMagazinePrefere(){
        return magazinePrefere;
    }

    //setter pour modifier le magazine préféré
    public void setMagazinePrefere(String newMagazinePrefere){
        magazinePrefere = newMagazinePrefere;
     }
}








