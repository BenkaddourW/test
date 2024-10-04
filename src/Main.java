//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        GestionDocumentsImpl bibliotheque =new GestionDocumentsImpl();

        AffichageDocuments affichageSimple = new AffichageSimple();
        AffichageDocuments affichageDetaille = new AffichageDetaillee();

       Documents L1 = new Livre( "Introduction à la Programmation","3", "A. Dupont");
       Documents R1 =new Revue( "Science et Technologie", "1","B. Martin");
       Documents A1=new ArticledeRecherche( "Études en Machine Learning","2", "C. Bernard");

        bibliotheque.ajouteDocument(L1);
        bibliotheque.ajouteDocument(R1);
        bibliotheque.ajouteDocument(A1);
        bibliotheque.ajouteDocument(A1);

        System.out.println("********Documents dans la bibliothèque :********");
        affichageDetaille.afficher(bibliotheque.getDocuments());

        System.out.println("******** Emprunter un document :********");
        bibliotheque.emprunterDoc(L1);
        System.out.println("Détails du document emprunté:"+L1);

        System.out.println("******** Retour d'un document:********");
        bibliotheque.retournerDoc(L1);
        System.out.println("Détails du document retourner:"+L1);

        System.out.println("********Tri des documents par identifiant :********");


        TriDocumentsImpl tri = new TriDocumentsImpl(bibliotheque.getDocuments());

        tri.triedocs();

        affichageDetaille.afficher(tri.getDocuments());
        System.out.println("********Recherche d'un document par identifiant ID:********");

        RechercherDocumentImpl recherche = new RechercherDocumentImpl(bibliotheque.getDocuments());

        Documents docRecherche = recherche.rechercheDocument("1");

        if (docRecherche != null) {
            System.out.println("Document trouvé : " + docRecherche);
        } else {
            System.out.println("Aucun document trouvé avec l'identifiant 1.");
        }













    }
}