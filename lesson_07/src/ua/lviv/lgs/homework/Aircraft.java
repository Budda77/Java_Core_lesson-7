package ua.lviv.lgs.homework;

public abstract class Aircraft {
	int length;
	int width; 
	double weight;
	
	public Aircraft(int length, int width, double weight) {
		super();
		this.length = length;
		this.width = width;
		this.weight = weight;
	}
	

	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	 abstract void engineStart();
	 abstract void aircraftFlight();
	 abstract void aircrafLanding();

	@Override
	public String toString() {
		return "Aircraft [length=" + length + ", width=" + width + ", weight=" + weight + "]";
	}
	 
	 
	 
	 
	 
}
