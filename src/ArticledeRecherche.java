public class ArticledeRecherche extends Documents {
    public ArticledeRecherche(String titre, String identifiant, String auteur) {
        super(titre, identifiant, auteur);
    }

    @Override
    public String getType() {
        return "Article de Recherche ";
    }

//    @Override
//    public String toString() {
//        return "[Article de Recherche]-->" +"ID : " + identifiant +" ,titre :" + titre +" ,Auteur :" + auteur +
//                " ,EstEmprunte :" + (estEmprunte ? "Oui" : "Non");
//    }
}
