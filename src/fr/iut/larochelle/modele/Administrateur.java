package fr.iut.larochelle.modele;

/**
 * <h1>Classe Administrateur</h1>
 * 
 * @author yoann
 */
public class Administrateur extends Professeur {
    
    public Administrateur(String username, String password, Matiere matiere) {
        super(username, password, matiere);
    }
    
    
    /**
     *
     * @param username
     * @param password
     */
    public void inscrire(String username, String password) {
        
    }
    
    /**
     * <h2>Desinscrire un etudiant</h2>
     * @param username nom d'utilisateur
     */
    public void desinscrire(String username) {
        // TODO - implement Administrateur.inscrire
        throw new UnsupportedOperationException();
    }
    
}
