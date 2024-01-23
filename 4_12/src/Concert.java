import java.util.Scanner;

class Concert{ 
    Scanner scanner = new Scanner(System.in);
    Seat seat = new Seat();
    public void run(){
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            int choice = scanner.nextInt();
            if(choice <1 || choice >4){
                System.out.println("다시 입력해주세요.");
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
        System.out.print("좌석구분 S(1), A(2), B(3)>>");
        int select = scanner.nextInt();
        if(select<1||select>3){
            System.out.println("다시 입력해주세요.");
            return;
        }
        switch(select){ // 좌석 종류를 선택하는 조건문 번호 예외처리할것
        case 1:
            seat.showsSeat();
            System.out.print("이름>>");
            name = scanner.next();
            System.out.print("번호>>");
            int num = scanner.nextInt();
            // if 그 자리가 ---가 아니라면 자리가 차있는것. break문으로
            // 빠져나오도록 해야함
            seat.setsSeat(num, name);
            break;
        case 2:
            seat.showaSeat();
            System.out.print("이름>>");
            name = scanner.next();
            System.out.print("번호>>");
            num = scanner.nextInt();
            seat.setaSeat(num, name);
            break;
        case 3:
            seat.showbSeat();
            System.out.print("이름>>");
            name = scanner.next();
            System.out.print("번호>>");
            num = scanner.nextInt();
            seat.setbSeat(num, name);
            break;
        }
    }
    public void show(){
        seat.showsSeat();
        seat.showaSeat();
        seat.showbSeat();
        System.out.println("<<<조회를 완료하였습니다.>>>");
    }
    public void cancel(){
        int select, num; 
        String name;
        System.out.print("좌석 S:1, A:2, B:3>>");
        select = scanner.nextInt();
        if(select <1 || select>3){
            System.out.print("댜시 입력해주세요.");
            return;
        }
        switch(select){
        case 1:
            seat.showsSeat();
            System.out.print("이름>>");
            name = scanner.next();
            seat.cancelSeat(select,name);
            break;
        case 2:
            seat.showaSeat();
            System.out.print("이름>>");
            name = scanner.next();
            seat.cancelSeat(select,name);
            break;
        case 3:
            seat.showbSeat();
            System.out.print("이름>>");
            name = scanner.next();
            seat.cancelSeat(select,name);
            break;
        }
    }
}
		
	




