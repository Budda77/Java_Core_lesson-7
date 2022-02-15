package ua.lviv.lgs.lsp.good;

public class Rectangle implements Square{
	
	int width;
	int height;
	
	
	
	public void setWidth(int width) {
		this.width = width;
	}



	public void setHeight(int height) {
		this.height = height;
	}



	public int calculateSquire() {
		return width * height;
	}

}
