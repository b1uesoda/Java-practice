import java.util.Scanner;

class Concert{ 
    Scanner scanner = new Scanner(System.in);
    Seat seat = new Seat();
    public void run(){
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
            int choice = scanner.nextInt();
            if(choice <1 || choice >4){
                System.out.println("�ٽ� �Է����ּ���.");
                continue;
            }
            switch(choice){
            case 1:
                this.reserve();
                break;
            case 2:
                this.show();
                break;
            case 3: 
                this.cancel();
                break;
            case 4:
                return;
            }
        }
    }
    
    public void reserve(){
        String name;
        System.out.print("�¼����� S(1), A(2), B(3)>>");
        int select = scanner.nextInt();
        if(select<1||select>3){
            System.out.println("�ٽ� �Է����ּ���.");
            return;
        }
        switch(select){ // �¼� ������ �����ϴ� ���ǹ� ��ȣ ����ó���Ұ�
        case 1:
            seat.showsSeat();
            System.out.print("�̸�>>");
            name = scanner.next();
            System.out.print("��ȣ>>");
            int num = scanner.nextInt();
            // if �� �ڸ��� ---�� �ƴ϶�� �ڸ��� ���ִ°�. break������
            // ������������ �ؾ���
            seat.setsSeat(num, name);
            break;
        case 2:
            seat.showaSeat();
            System.out.print("�̸�>>");
            name = scanner.next();
            System.out.print("��ȣ>>");
            num = scanner.nextInt();
            seat.setaSeat(num, name);
            break;
        case 3:
            seat.showbSeat();
            System.out.print("�̸�>>");
            name = scanner.next();
            System.out.print("��ȣ>>");
            num = scanner.nextInt();
            seat.setbSeat(num, name);
            break;
        }
    }
    public void show(){
        seat.showsSeat();
        seat.showaSeat();
        seat.showbSeat();
        System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
    }
    public void cancel(){
        int select, num; 
        String name;
        System.out.print("�¼� S:1, A:2, B:3>>");
        select = scanner.nextInt();
        if(select <1 || select>3){
            System.out.print("���� �Է����ּ���.");
            return;
        }
        switch(select){
        case 1:
            seat.showsSeat();
            System.out.print("�̸�>>");
            name = scanner.next();
            seat.cancelSeat(select,name);
            break;
        case 2:
            seat.showaSeat();
            System.out.print("�̸�>>");
            name = scanner.next();
            seat.cancelSeat(select,name);
            break;
        case 3:
            seat.showbSeat();
            System.out.print("�̸�>>");
            name = scanner.next();
            seat.cancelSeat(select,name);
            break;
        }
    }
}
		
	




