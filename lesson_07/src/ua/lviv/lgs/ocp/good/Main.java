package ua.lviv.lgs.ocp.good;

public class Main {

	public static void main(String[] args) {
		
		
		Personality p = new FamilyPersonality();
		Personality cp = new CasualPersonality();
		//System.out.println(p.greet());

		Greeter persona = new Greeter(p);
		Greeter persona2 = new Greeter(cp);
		
		
		System.out.println(persona.greet());
		System.out.println(persona2.greet());
		
		

	}

}
