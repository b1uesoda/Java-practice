public class Rectangle {
	int x;
	int y;
	int width;
	int height; 
	
	public Rectangle(int a, int b, int c, int d) {
		x = a;
		y = b;
		width = c;
		height = d;
	}
	
	public void show() {
		System.out.println("(" + x + "," + y + ")���� ũ�Ⱑ " + width + "x" + height + "�� �簢��");
	}
	
	public int square() {
		int area = width * height;
		return area;
	}
	
	public boolean contains(Rectangle r) {
		if(x < r.x && y < r.y)
			if((width+x) > (r.x+r.width) && (height+y) > (r.y+r.height))
				return true;
		return false;
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("s�� ������ " + s.square());
		if(t.contains(r)) System.out.println("t�� r�� �����մϴ�");
		if(t.contains(s)) System.out.println("t�� s�� �����մϴ�.");
	}
}