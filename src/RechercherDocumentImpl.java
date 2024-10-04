import java.util.ArrayList;
import java.util.List;

public class RechercherDocumentImpl implements RechercherDocument {

    private List<Documents> documents;

    public RechercherDocumentImpl(List<Documents> documents) {
        this.documents = documents;
    }

    @Override
    public Documents rechercheDocument(String id)
    {
        for (Documents doc : documents)
        {
            if (doc.getIdentifiant().equals(id)) {
                return doc;
            }
        }
        return null;

    }
}
