import java.util.ArrayList;
import java.util.List;


public class TriDocumentsImpl implements TriDocuments {
    private List<Documents> documents;

    public TriDocumentsImpl(List<Documents> documents) {
        this.documents = documents;
    }
    @Override
    public void triedocs() {
        documents.sort((d1, d2) -> d1.getIdentifiant().compareTo(d2.getIdentifiant()));
    }

    public List<Documents> getDocuments() {
        return documents;
    }
}
