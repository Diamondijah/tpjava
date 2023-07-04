public class Monde{
   private int nbL; 
   private int nbC;
   private boolean[][] mat;

   public int getNbL() {
        return nbL;
    }
   
   public int getNbC() {
        return nbC;
    }
   

   public Monde() {
        this(10,10);  
    }

    public Monde(int nbL, int nbC) {
        this.nbL = nbL;
        this.nbC = nbC;
        this.mat = new boolean[nbL][nbC];
    }
     //Méthode pour représenter le monde sous forme de chaîne de caractères
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < nbL; i++){
            for(int j=0; j < nbC; j++){
                if(mat[i][j]) {
                    sb.append("o ");
                }else {
                    sb.append(". ");
                }
            }
            sb.append("\n");

        }
        return sb.toString();
    }
    // Méthode pour mettre un papier gras dans la case (i, j)
    public void metPapierGras(int i , int j) {
        if(i >= 0 && i < nbL && j >= 0 && j < nbC) {
            mat[i][j] = true;
        }
    }
   
    // Méthode pour enlever le papier gras de la case (i, j)
     public void prendPapierGras(int i, int j) {
         if(i >= 0 && i < nbL && j >= 0 && j < nbC) {
            mat[i][j] = false;
        }
     }
     //Methode pour savoir si une case a un papier gras
     public boolean estSale(int i, int j) {
         if(i >= 0 && i < nbL && j >= 0 && j < nbC) {
            return mat[i][j];
        }
        return false;
     }
     //Methode qui rend le nombre de papier gras dans le monde
     public int nbPapiersGras() {
        int count = 0;
        for(int i =0; i < nbL; i++) {
            for(int j =0; j < nbC; j++) {
                if(mat[i][j]) {
                    count++;
                }
            }
        }
        return count;
     }
//  public static void main(String[] args) {
//         Monde monde = new Monde(3, 3);
//         monde.metPapierGras(0, 1);
//         monde.metPapierGras(2, 2);

//         System.out.println(monde.toString());
//     }
}