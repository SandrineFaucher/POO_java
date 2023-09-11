import Humains.*; //Ceci permet d'importer toutes les classes du projet Humains


//Classe principale du programme
public class Main{

    // Méthode principale du programme obligatoire en java  
   public static void main(String[] args) {

        //je crée deux instances de la classe homme avec les deux constructeurs
        Homme daniel = new Homme("Dupont", "Daniel" , 40);
        Homme jean = new Homme("Gautier", "Jean", 40, 1.70, 70, 1983, "France", "Marseille");
       
        
        // j'affiche les données des deux hommes selon la méthode sayHello
        daniel.sayHello();
        
        jean.sayHello();
        
        // j'affiche l'équipe préférée 
        System.out.println("Equipe préférée : " + daniel.getEquipePreferee());
        System.out.println("Equipe préférée : " + jean.getEquipePreferee());

        //Je change le poids avec le setter 
        //j'attribue un poids à daniel 
        daniel.setPoids(65);
        System.out.println("nouveau poids de Daniel :" + daniel.getPoids() );

        // je change le poids de jean 
        jean.setPoids(jean.getPoids() + 5);
        System.out.println("Nouveau poids après confinement : " + jean.getPoids());

        //je crée une instance de la classe femme avec le deuxième constructeur 
        Femme jeanne = new Femme("Charrier", "Jeanne", 47, 1.60, 55, 1976, "France", "Elle");

        //j'affiche les infos de Jeanne avec la méthode sayHello()
        jeanne.sayHello();

        //j'affiche son magazine préféré 
        System.out.println("Mon magazine préféré est : " + jeanne.getMagazinePrefere());

        //je modifie son magazine préféré 
        jeanne.setMagazinePrefere("Niort Agglo Magazine");

        //j'affiche son nouveau magazine préféré
        System.out.println("Mon magazine préféré est : " + jeanne.getMagazinePrefere());


        //je crée un tableau avec mes trois humains créés 
        Humain[] clients = {daniel, jean, jeanne };


        //j'ajoute des informations à Daniel à partir des setters 
        daniel.setTaille(1.65);
        daniel.setAnnee(1978);
        daniel.setPays("Portugal");

        // Je boucle sur ce tableau pour afficher le sayHello avec les 3 personnes
        for (Humain client : clients) {

            client.sayEverything();
        }


    }
}

    

