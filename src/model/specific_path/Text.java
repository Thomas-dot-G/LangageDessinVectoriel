package model.specific_path;

import model.Shape;
import model.ShapeName;

public class Text extends Shape {

	/************************************
	 *	Attributes
	 ************************************/	
	private int x; // Where is the start of the text (x axis)
	private int y; // Where is the start of the text (y axis, from the top)
	private String text; // The actual text that will be displayed
	
	/************************************
	 *	Constructors
	 ************************************/	
	public Text(int x, int y, String text) {
		this.x = x;
		this.y = y;
		this.text = text;
	}
	
	public Text() {
		this.x = 0;
		this.y = 0;
		this.text = "Text";
	}
	
	/************************************
	 *	Getters and Setters
	 ************************************/	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
		this.setChanged();
		this.notifyObservers();
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
		this.setChanged();
		this.notifyObservers();
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
		this.setChanged();
		this.notifyObservers();
	}

	@Override
	public ShapeName getName() {
		return ShapeName.Text;
	}

	/************************************
	 *	Methods
	 ************************************/
	
	@Override
	public boolean isFillable() {
		return false;
	}
	
}
