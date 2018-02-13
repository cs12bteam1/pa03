package pa03;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
//Osamah's Circle
/**
 * RunCircles are gold circles which move at a constant velocity on the board
 * and bounce off the edges, but whose radius grows and shrinks, while their
 * transparency changes
 */
public class RunCircle extends CircleShape {

	private double vr = 1.0;

	/**
	 * create a circle that has writing inside and changes color as well as radius
	 */
	public RunCircle() {
		super();
	}

	/**d
	 * update the circle as usual, but also change the radius. If it gets too big,
	 * then start it shrinking, if it gets too small then start it growing.
	 */
	public void update(double dt) {
		this.radius += dt * vr;

		if (this.radius < 10)
			this.vr *= -1;
		else if (this.radius > 50)
			this.vr *= -1;
		super.update(dt);
	}

	public void draw(Graphics g) {
		int u = (int) (x - radius);
		int v = (int) (y - radius);
		int w = (int) (2 * radius);
		int h = w;
		Color myColor = new Color(255,215,0);
		g.setColor(myColor);
		g.fillRect(u/2,v/2,w/2,h/2);
		g.setColor(Color.BLACK);
		g.drawOval(u,v,w,h);
		Font f = new Font("Helvetica", Font.BOLD, 20);
		g.setFont(f);
		g.setColor(Color.WHITE);
		g.drawString("RUN!", 495, 260);
	}

}
