public class PollueurToutDroit extends RobotPollueur{
    private int colDepart;

    public PollueurToutDroit(int x, int y, Monde m, int colDepart){
         super(x,y,m);
         this.colDepart = colDepart;
    }
    public void parcourir(){
        vaEn(0, colDepart);
        for(int i=0; i< m.getNbL(); i++){
            m.metPapierGras(i, colDepart);
            if(i == m.getNbL() - 1){
                break;
            }
            vaEn(i + 1, colDepart);
           
        }

    }
}