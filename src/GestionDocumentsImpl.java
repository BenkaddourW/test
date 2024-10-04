import java.util.ArrayList;
import java.util.List;

public class GestionDocumentsImpl implements GestionDocuments,GestionEmprunt {

    private List<Documents> documents = new ArrayList<>();

    @Override
    public void supprimerDocument(Documents docs) {
        documents.remove(docs);

    }

    @Override
    public void ajouteDocument(Documents docs) {

        for (Documents doc : documents) {
            if (doc.getIdentifiant().equals(docs.getIdentifiant())) {
                System.out.println("Erreur : Un document avec l'identifiant " + docs.getIdentifiant() + " existe déjà.");
                return;
            }
        }
        documents.add(docs);
        System.out.println("Document ajouté : " + docs.getTitre());
    }

    @Override
    public void emprunterDoc(Documents docs) {
        if (documents.contains(docs) && !((Documents) docs).isEstEmprunte()) {
            ((Documents) docs).setEstEmprunte(true);
            System.out.println("Le document : [" + docs.getTitre()+"] a été emprunté.");

        }
        else
            System.out.println("Le document [" + docs.getTitre()+"] non disponible pour emprunt.");

    }

    @Override
    public void retournerDoc(Documents docs) {
        if (documents.contains(docs) && ((Documents) docs).isEstEmprunte()) {
            ((Documents) docs).setEstEmprunte(false);
            System.out.println("Le document : ["+  docs.getTitre()+"] a été retourné.");
        }
        else
            System.out.println("Le document [" +  docs.getTitre()+ "] non trouvé ou non emprunté.");
    }

    public List<Documents> getDocuments() {
        return new ArrayList<>(documents);
    }
    }

