public class TV {
	String name;
	int year;
	int size;
	
	public TV(String n, int a, int b) {
		name = n;
		year = a;
		size = b;
	}
	
	public void show() {
		System.out.println(name + "���� ���� " + year + "���� " + size + "��ġ TV");
	}

	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}
}
