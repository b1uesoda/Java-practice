public class CircleApp {
	private int x, y, radius;
	
	public CircleApp(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public String toString() {
		return "Circle(" + x + "," + y + ")반지름" + radius;
	}
	public boolean equals(Object obj) {
		CircleApp p = (CircleApp)obj;
		if(p.x == x && p.y == y)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		CircleApp a = new CircleApp(2, 3, 5);
		CircleApp b = new CircleApp(2, 3, 30);
		System.out.println("원 a : " + a);
		System.out.println("원 b : " + b);
		if(a.equals(b))
			System.out.println("같은 원");
		else
			System.out.println("서로 다른 원");
	}
}
