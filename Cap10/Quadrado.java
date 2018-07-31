
class Quadrado implements AreaCalculavel {
	private int side;
	
	public Quadrado(int side) {
		this.side = side;
	}
	
	public double calculateArea() {
		return (this.side * this.side);
	}
}
