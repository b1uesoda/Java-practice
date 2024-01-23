class Point {
    public int x, y;
    public Point(int x, int y){
    	this.x = x; this.y = y;
    }
    protected void move(int x, int y) {
    	this.x =x; this.y = y;
    }
}

class PositivePoint1 extends Point{
    public PositivePoint1() {
        super(0, 0);
    }
    public PositivePoint1(int x, int y) {
        super(x, y);
        if(x < 0 || y < 0){
            super.move(0,0);
        }
    }
    public void move(int x, int y){
        if(x > 0 && y > 0) {
            super.move(x, y);
        }
    }
    public String toString(){
        return "(" + x + ", " + y + ")의 점";
    }
}

public class PositivePoint {
    public static void main(String[] args) {
        PositivePoint1 p = new PositivePoint1();
        p.move(10, 10);
        System.out.println(p.toString()+"입니다.");
        p.move(-5,5); 
        System.out.println(p.toString()+"입니다.");
        PositivePoint1 p2 = new PositivePoint1(-10, -10);
        System.out.println(p2.toString()+"입니다.");
    }
}