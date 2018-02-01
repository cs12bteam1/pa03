package pa03;
import java.awt.Color;
import java.awt.Graphics;


/**
 * RadiusChangingCircles are yellow circles which move at a constant velocity
 * on the board and bounce off the edges, but whose radius grows and shrinks.
*/
public class SquareShape extends CircleShape{

	/**
	 * create a radius changing circle and set the color to yellow
	 */
  public SquareShape(){
    super();
		this.color = new java.awt.Color(0,0,255,100); // transparent blue
  }

	/**
	 * update the circle as usual, but also change the radius. If it gets too big,
	 * then start it shrinking, if it gets too small then start it growing.
	 */
   public void draw( Graphics g ) {
       int u = (int)(x-radius);
       int v = (int)(y-radius);
       int w = (int)(2*radius);
       int h = w;
       g.setColor( color );
       g.fillRect( u,v,w,h );
       g.setColor( Color.BLACK );
       g.drawRect(u,v,w,h );
   }
  }
