public abstract class RobotPollueur extends Robot{
   public RobotPollueur(int x, int y, Monde m) {
          super(x, y, m);
   }

    
    public  void polluer(){
        m.metPapierGras(posx, posy);

    }
}
    //au cas ou il peut etre instancié sans etre dans un monde
//     public RobotPollueur(int x, int y, Monde m) {
//         super(x, y, m);
//     }
//    private RobotPollueur() {
//         super(null); 
//     }

//      public void polluer() {
//         if (m != null) {
//             m.metPapierGras(posx, posy);
//         }
//     }
