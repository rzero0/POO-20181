
class Retangulo implements AreaCalculavel {
	private int width;
	private int	height;
	
	public Retangulo(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public double calculateArea() {
		return (this.width * this.height);
	}

}
