import java.util.List;

public class AffichageDetaillee implements AffichageDocuments {
    @Override
    public void afficher(List<Documents> docs) {
        if (docs == null || docs.isEmpty()) {
            System.out.println("Aucun média à afficher.");
            return;
        }

        for (Documents doc : docs) {
            System.out.println(doc);
        }
    }
}
