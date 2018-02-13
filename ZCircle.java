package pa03;

import java.awt.Color;

public class ZCircle extends RadiusChangingCircle{
  //ZCircle is Zhaonan's Circle

  public Color c;

  public ZCircle(){
    super();
    this.color = new java.awt.Color(255,255,0,100);
  }

  public void update(double dt){
    int r = (int)(Math.random()*2);
    int g = (int)(Math.random()*2);
    int b = (int)(Math.random()*2);
    int rc = (this.color.getRed() +  r) % 255;
    int gc = (this.color.getGreen() +  g) % 255;
    int bc = (this.color.getBlue() +  b) % 255;
    c = new java.awt.Color(rc,gc,bc,100);
    this.color = c;
    super.update(dt);
  }
}
