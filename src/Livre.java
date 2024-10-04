public class Livre extends Documents {

    public Livre(String titre, String identifiant, String auteur) {
        super(titre, identifiant, auteur);
    }

    @Override
    public String getType() {
        return "Livre";
    }
//
//    @Override
//    public String toString() {
//        return "[Livre]-->" +"ID : " + identifiant +" ,titre :" + titre +" ,Auteur :" + auteur +
//                " ,EstEmprunte :" + (estEmprunte ? "Oui" : "Non");
//    }
}
