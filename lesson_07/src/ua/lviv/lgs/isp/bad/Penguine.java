package ua.lviv.lgs.isp.bad;

public class Penguine implements Bird{

	@Override
	public void fly() {
		// do not working
		
	}

	@Override
	public void molt() {
		System.out.println("Penguine is molting");
		
	}
	
	public void swim() {
		System.out.println("Penguine is swiming");
		
	}

}
