package xixuan.froggerapp.models;

import javafx.scene.image.Image;

public class Turtle extends Actor{
	private Image turtle1;
	private Image turtle2;
	private Image turtle3;
	private double speed;
	private int size;
	private int xpos;
	private int ypos;
	 
	public Turtle(int size, int xpos, int ypos, double speed) {
		setSize(size);
		setXpos(xpos);
		setYpos(ypos);
		setSpeed(speed);	
		
		turtle1 = new Image("file:resources/images/turtles/TurtleAnimation1.png", this.size, this.size, true, true);
		turtle2 = new Image("file:resources/images/turtles/TurtleAnimation2.png", this.size, this.size, true, true);
		turtle3 = new Image("file:resources/images/turtles/TurtleAnimation3.png", this.size, this.size, true, true);

		setImage(turtle2);
	}
	
	@Override
	public void act(long now) {

		if (now/900000000  % 3 ==0) {
			setImage(turtle2);			
		}
		else if (now/900000000 % 3 == 1) {
			setImage(turtle1);		
		}
		else if (now/900000000 %3 == 2) {
			setImage(turtle3);
		}
			
		move(speed , 0);
		
		if (getX() > 600 && speed>0)
			setX(-200);
		if (getX() < -75 && speed<0)
			setX(600);
	}
	
	//Set the speed of the turtle
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	//Return the speed of the turtle
	public double getSpeed() {
		return this.speed;
	}

	//Return the size of the turtle
	public int getSize() {
		return this.size;
	}

	//Set the size of the turtle
	public void setSize(int size) {
		this.size = size;
	}
	
	//Return the x position of the turtle
	public int getXpos() {
		return this.xpos;
	}

	//Set the x position of the turtle
	public void setXpos(int xpos) {
		this.xpos = xpos;
		setX(xpos);
	}

	//Return the y position of the turtle
	public int getYpos() {
		return this.ypos;
	}

	//Set the y position of the turtle
	public void setYpos(int ypos) {
		this.ypos = ypos;
		setY(ypos);
	}	
}
