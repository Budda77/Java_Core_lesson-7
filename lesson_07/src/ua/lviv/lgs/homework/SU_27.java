package ua.lviv.lgs.homework;

public class SU_27 extends Aircraft implements SpecialCapability{
	
	private int maxSpeed;
	private String color;
	
	AircraftControl aircraftControl = new AircraftControl();	


	public SU_27(int length, int width, double weight, int maxSpeed, String color) {
		super(length, width, weight);
		this.maxSpeed = maxSpeed;
		this.color = color;
	}
	
	
		public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public AircraftControl getAircraftControl() {
		return aircraftControl;
	}


	public void setAircraftControl(AircraftControl aircraftControl) {
		this.aircraftControl = aircraftControl;
	}


	public void moveUp() {		
		aircraftControl.up();
	}
	
	public void moveDown() {		
		aircraftControl.down();
	}
	
	public void moveLeft() {		
		aircraftControl.left();
	}
	
	public void moveRight() {		
		aircraftControl.right();
	}

	@Override
	void engineStart() {
		System.out.println("Engine is starting, time before the flight  " + (int)(20 + Math.random() * 88)+ " minutes");	
	}

	@Override
	void aircraftFlight() {
		System.out.println("The aircraft is going to flight  " + Math.random() * 1000 + " kilometers");
	}

	@Override
	void aircrafLanding() {
		System.out.println("Aircraft is lending.");
	}


	@Override
	public void turboAcceleration() {
		int speed = getMaxSpeed()+100;
		setMaxSpeed(speed);
		
	}


	@Override
	public void stealthTechnology() {
		System.out.println("Aircraft is invisible  " + (int)(Math.random() * 60)+ " minutes");	

		
	}


	@Override
	public void nuclearStrike() {
		System.out.println("Aircraft is striking with " + (int)(1+(Math.random() * 10))+ " nuclear warheads.");	
		
	}


	@Override
	public String toString() {
		return "SU_27 [maxSpeed=" + maxSpeed + ", color=" + color + ", aircraftControl=" + aircraftControl
				+ ", toString()=" + super.toString() + "]";
	}

	
	
	
	
	
	
}
