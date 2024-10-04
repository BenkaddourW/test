public abstract class Documents {
    protected String titre;
    protected String identifiant;
    protected String auteur;
    protected boolean estEmprunte = false;

    public Documents(String titre, String identifiant, String auteur) {
        this.titre = titre;
        this.identifiant = identifiant;
        this.auteur = auteur;
    }

    public String getTitre() {
        return titre;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public String getAuteur() {
        return auteur;
    }

    public boolean isEstEmprunte() {
        return estEmprunte;
    }

    public void setEstEmprunte(boolean estEmprunte) {
        this.estEmprunte = estEmprunte;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return "[" + getType() + "] --> ID : " + identifiant + " , titre : " + titre +
                " , Auteur : " + auteur + " , EstEmprunte : " + (estEmprunte ? "Oui" : "Non");
    }

}
