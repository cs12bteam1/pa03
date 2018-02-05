package pa03;
import java.awt.Color;
import java.awt.Graphics;

/**
 * RadiusChangingCircles are yellow circles which move at a constant velocity
 * on the board and bounce off the edges, but whose radius grows and shrinks.
*/
public class GreenYellowCircles extends CircleShape{

  private int count=0;
  private double vr = 1.0;

	/**
	 * create a radius changing circle and set the color to yellow
	 */
  public GreenYellowCircles(){
    super();
    this.color = new Color(255,255,0);
  }

	/**
	 * update the circle as usual, but also change the radius. If it gets too big,
	 * then start it shrinking, if it gets too small then start it growing.
	 */
  public void update(double dt){
    // change the properties of the CircleShape after dt seconds have elapsed.
    this.x += dt*vx;  // for now they do not move
    this.y += dt*vy;
    if(count<1000){
      this.color = new Color(255,255,0);
      count++;
    }
    if(count>=1000){
      this.color = new Color(0,255,0);
      count++;
      if(count>2000){
        count = 0;
      }
    }
    System.out.println(count);
    this.keepOnBoard();
  }





  }
