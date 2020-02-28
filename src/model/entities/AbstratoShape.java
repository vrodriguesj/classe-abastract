package model.entities;

import model.entities.Color;

public abstract class AbstratoShape implements Shape {
	
	private Color color;

	public AbstratoShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}	
}
