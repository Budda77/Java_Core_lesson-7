package ua.lviv.lgs.dip.good;

public class WebClient {
	
DataAccesable dataAccesable = new WebDataAccess();
	
	void fetchData() {
		dataAccesable.executeAccess();
		System.out.println("Data is fetch");
		
	}

}
