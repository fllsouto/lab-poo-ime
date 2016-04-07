package class6;

class FixedPoint {
	private int x;
	private int y;
	public FixedPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String showPoint() {
		return "(" + this.x + ", " + this.y + ")";
	}
	
	public void swapPoints() {
		int temp = x;
		x = y;
		y = temp;
	}
	
	public static void deletePoint(FixedPoint p) {
		p = null;
	}
	public static void main(String[] args) {
		final FixedPoint p = new FixedPoint(23,42);
//		p = new FixedPoint(23,43);
		
		System.out.println(p.showPoint());
		p.swapPoints();
		System.out.println(p.showPoint());
//		p = null;
		System.out.println(p.showPoint());
	}
}