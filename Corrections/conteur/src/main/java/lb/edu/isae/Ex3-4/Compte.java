public class Compte {
  private int solde = 0;

  synchronized public void ajouter(int somme) {
    solde += somme;
    System.out.printf(" ajoute %d ", somme);
  }

  synchronized public void retirer(int somme) {
    solde -= somme;
    System.out.printf(" retire %d", somme);
  }

  synchronized public void operationNulle(int somme) {
    solde += somme;
    System.out.printf(" ajoute %d ", somme);
    solde -= somme;
    System.out.printf(" retire %d", somme);
  }

  public int getSolde() {
    return solde;
  }
}
    
