class PointPolaire implements IPoint{
  private double rad;
  private double lon;
  public PointPolaire(double r, double l){
    rad=r;
    lon=l;
  }
  public PointPolaire(){
    rad=65;
    lon=5;
  }
  public PointPolaire(PointPolaire p){
    rad=p.rad;
    lon=p.lon;
  }
  //Getters
  public double getRad(){return rad;}
  public double getLong(){return lon;}

  //Setters
  public void setRad(double x){rad=x;}
  public void setLong(double y){lon=y;}

  //methodes
  public String toString(){
    return "angle : "+rad+"; longeur : "+lon;
  }

  public void afficher(){
    System.out.println(toString());
  }

  public void translation(double dx, double dy){
    double x = lon*Math.cos(rad);
    double y = lon*Math.sin(rad);
    x=dx+x;
    y=dy+y;
    lon=Math.sqrt((x*x)+(y*y));
    if (x>0&&y>=0) {
      rad=Math.atan(y/x);
    }
    if (x>0&&y<0) {
      rad=Math.atan(y/x)+2*Math.PI;
    }
    if(x<0){
      rad=Math.atan(y/x)+Math.PI;
    }
    if(x==0&&y>0){
      rad=(Math.PI)/2;
    }
    if(x==0&&y<0){
      rad=-(Math.PI)/2;
    }
  }


  public double distanceALOrigine(){
    return this.lon;
  }
   /**
    * Effectue une translation sur le point suivant le vecteur (dx,dy)
    * @param dx coordonn&eacute;e x du vecteur
    * @param dy coordonn&eacute;e y du vecteur
    */
}
