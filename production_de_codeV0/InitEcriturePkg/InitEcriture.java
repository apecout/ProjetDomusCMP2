package InitEcriturePkg;

import java.io.*;

public class InitEcriture {

    File fichierCMaisonUser;
    File fichierHabitatSpecific;
    FileWriter writerCMaison;
    FileWriter writerHabitat;

    //----------Constructeur----------
    public InitEcriture(String nomCMaison, String nomHabitat){

         fichierCMaisonUser = new File(nomCMaison);
         fichierHabitatSpecific = new File(nomHabitat);

         try{
             writerCMaison = new FileWriter(nomCMaison);
             writerHabitat = new FileWriter(nomHabitat);
             
             if (fichierCMaisonUser.createNewFile())
                 System.out.println("Ficher créé :"+ fichierCMaisonUser.getName());
             else {
                 if(fichierCMaisonUser.delete()){
                     System.out.println("Ficher supprimé :"+ fichierCMaisonUser.getName());
                     if (fichierCMaisonUser.createNewFile())
                         System.out.println("Ficher créé :"+ fichierCMaisonUser.getName());
                     else
                         System.out.println("Ficher déjà existant :"+ fichierCMaisonUser.getName());
                 } else {
                     System.out.println("Echec de la suppression du fichier :"+ fichierCMaisonUser.getName());
                 }
             }
    
             if (fichierHabitatSpecific.createNewFile())
                 System.out.println("Ficher créé :"+ fichierHabitatSpecific.getName());
             else {
                 if(fichierCMaisonUser.delete()){
                     System.out.println("Ficher supprimé :"+ fichierHabitatSpecific.getName());
                     if (fichierCMaisonUser.createNewFile())
                         System.out.println("Ficher créé :"+ fichierHabitatSpecific.getName());
                     else
                         System.out.println("Ficher déjà existant :"+ fichierHabitatSpecific.getName());
                 } else {
                     System.out.println("Echec de la suppression du fichier :"+ fichierHabitatSpecific.getName());
                 }
             }

             writerCMaison = new FileWriter(nomCMaison);
             writerHabitat = new FileWriter(nomHabitat);

         } catch(IOException e) {
             System.out.println("Erreur initEcriture");
         }
    }

    //----------MEthodes----------

    public File getFichierCMaisonUser() {
        return fichierCMaisonUser;
    }

    public File getFichierHabitatSpecific() {
        return fichierHabitatSpecific;
    }

    public FileWriter getWriterCMaison() {
        return writerCMaison;
    }

    public FileWriter getWriterHabitat() {
        return writerHabitat;
    }

    public void closeAll(){
        try{
            writerCMaison.close();
            writerHabitat.close();
        } catch (IOException e) {}
    }
}
