class Point {
	public int x, y;
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
	protected void move(int x, int y) {
		this.x = x; this.y = y;
	}
}

class ColorPoint1 extends Point {
	private String color;
	public ColorPoint1() {
		super(0, 0);
		color = "BLACK";
	}
	public ColorPoint1(int x, int y) {
		super(x, y);
		color = "BLACK";
	}
	public void setXY(int x, int y) {
		move(x, y);
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		return (color+"색의 ("+ x +","+ y +")의 점");
	}
}

public class ColorPoint {
	public static void main(String args[]) {
		ColorPoint1 zeroPoint = new ColorPoint1();
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColorPoint1 cp = new ColorPoint1(10, 10); 
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
	}
}