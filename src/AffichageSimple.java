import java.util.List;

public class AffichageSimple implements AffichageDocuments {
    @Override
    public void afficher(List<Documents> docs) {

        if (docs == null || docs.isEmpty()) {
            System.out.println("Aucun document à afficher.");
            return;
        }

        for (Documents doc : docs) {
            System.out.println("Le titre "+doc.getTitre()+", auteur: "+doc.getAuteur());
        }
    }
}
