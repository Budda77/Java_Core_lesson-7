package ua.lviv.lgs.homework;

public class AircraftControl {
	
	
	public void up() {		
		System.out.println("Aircraft is moving UP on " + (int)(1000 + Math.random() * 15000)+ " kilometers");	
	}
	
	public void down() {		
		System.out.println("Aircraft is moving DOWN on " + (int)(5 + Math.random() * 100)+ " kilometers");
	}
	
	public void left() {		
		System.out.println("Aircraft is moving LEFT on " + (int)(5 + Math.random() * 100) + " kilometers");
	}
	
	public void right() {		
		System.out.println("Aircraft is moving RIGHT on " + (int)(5 + Math.random() * 100) + " kilometers");
	}
	
	
	
	

}
