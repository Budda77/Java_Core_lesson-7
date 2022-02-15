package ua.lviv.lgs.isp.good;

public class Pinguine implements Swimable, Moltable{

	@Override
	public void swim() {
		System.out.println("Pinguine is swimming");
		
	}

	@Override
	public void molt() {
		System.out.println("Pinguine is molting");
		
	}

}
