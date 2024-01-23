public class ThreeSixNine {
	public static void main(String[] args) {
		
		for(int i = 3 ; i <= 99; i++) {
			if(i < 10) {
				if((i % 10) == 3 || (i % 10) == 6 || (i % 10) == 9) {
					System.out.print(i);
					System.out.println(" ¹Ú¼ö Â¦");
				}
			}
			else{
				if((i % 10) == 3 || (i % 10) == 6 || (i % 10) == 9 || (i / 10) % 3 == 0) {
					System.out.print(i);
					System.out.print(" ¹Ú¼ö Â¦");
					if((i - (i / 10)) % 3 == 0) {
						System.out.print("Â¦");
						System.out.println();
					}
					else
						System.out.println();
				}
			}
		}
	}
}

