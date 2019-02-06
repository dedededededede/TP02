class PointCartesien implements IPoint{
    //Attributs
    private double abs;
    private double ord;

    //Constructeurs
    public PointCartesien(){
      abs = 0;
      ord = 5;
    }

    public PointCartesien(double abs, double ord){
      abs = this.abs;
      ord = this.ord;
    }

    //Getters et Setters
    public double getAbs(){return abs;}
    public double getOrd(){return ord;}

    public void setAbs(double abs){abs = abs;}
    public void setOrd(double ord){ord = ord;}

    //Methodes
    public String toString(){
      return "abscisse : "+abs+"; ordonnee : "+ord;
    }

    /**
     * Calcule la distance entre l'origine et le point
     * @return la distance entre l'origine et le point
     */
    public double distanceALOrigine(){
      double a=Math.sqrt((Math.pow(this.abs,2.0))+(Math.pow(this.ord,2.0)));
      return a;
    }

    /**
     * Effectue une translation sur le point suivant le vecteur (dx,dy)
     * @param dx coordonn&eacute;e x du vecteur
     * @param dy coordonn&eacute;e y du vecteur
     */
    public void translation(double dx, double dy){
      dx += dx;
      dy += dy;
    }

    /**
     * Permet d'afficher le point &agrave; l'&eacute;cran
     */
     public void afficher(){
       System.out.println(toString());
     }
}
