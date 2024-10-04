public class Revue extends Documents {
    public Revue(String titre, String identifiant, String auteur) {
        super(titre, identifiant, auteur);
    }

    @Override
    public String getType() {
        return "Revue";
    }

//    @Override
//    public String toString() {
//        return "[Revue]-->" +"ID : " + identifiant +" ,titre :" + titre +" ,Auteur :" + auteur +
//                " ,EstEmprunte :" + (estEmprunte ? "Oui" : "Non");
//    }
}
