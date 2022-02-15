package ua.lviv.lgs.lsp.bad;

public class Rectangle {
	int weight;
	int height;
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}


	int calculateSquire() {
		return weight * height;
	}

}
