public abstract class Robot {
    protected int posx;
    protected int posy;
    protected Monde m;

    public Robot(int x, int y, Monde m){
        this.posx = x;
        this.posy = y;
        this.m = m;
    }

    public Robot(Monde m){
        this((int) Math.random() * m.getNbL(), (int) (Math.random() * m.getNbC()), m);
    }
    public void vaEn(int i, int j){

        if(i >= 0 && i < m.getNbL() && j >= 0 && j < m.getNbC()){
             this.posx = i;
             this.posy = j;
                     }
       
    
    }
       public void parcourir() {
        // La nature de cette méthode dépendra des sous-classes de la classe Robot
    }


}