package ua.lviv.lgs.lsp.good;

public class Squares implements Square{
	
	int width;
	
	

	public void setWidth(int width) {
		this.width = width;
	}



	@Override
	public int calculateSquire() {
	
		return width * width;
	}

}
