package Humains;

public class Homme extends Humain {

    // variables d'instance

    String equipePreferee = "aucune"; // définition d'une valeur par défaut

    // constructeur 1
    public Homme(String nomHomme, String prenomHomme, int ageHomme) {
        super(nomHomme, prenomHomme, ageHomme);

    };

    // constructeur 2
    public Homme(String nomHomme, String prenomHomme, int ageHomme, double tailleHomme,
            double poidsHomme, int anneeHomme, String paysHomme, String equipePrefereeHomme) {

        super(nomHomme, prenomHomme, ageHomme, tailleHomme, poidsHomme, anneeHomme, paysHomme);
        equipePreferee = equipePrefereeHomme;

    };

    // méthode "sayHello"
    @Override // lorsqu'on redéfinie une méthode on dit qu'on la surcharge
    public void sayHello() {
        System.out.println("Je m'appelle" + nom + prenom + ", je suis un homme et j'ai" +
                age + "ans.");
    }

    // méthode sayEverything
    @Override
    public void sayEverything() {
        System.out.println("Bonjour je m'appelle " + prenom + " " + nom + ", j'ai " + age + " ans, je pèse " + poids
                + " Kg, je mesure " + taille + " cm, je suis né(e) en " + annee + " et je viens de " + pays
                + " mon equipe préférée est : " + equipePreferee);

    }

    // getter pour récupérer l'équipe préférée
    public String getEquipePreferee() {
        return equipePreferee;
    }
}
