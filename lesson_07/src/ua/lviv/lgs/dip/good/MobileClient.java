package ua.lviv.lgs.dip.good;

public class MobileClient {
	
	DataAccesable dataAccesable = new MobileDataAccess();
	
	void fetchData() {
		dataAccesable.executeAccess();
		System.out.println("Data is fetch");
		
	}

}
