class Seat{
	private String[] sClass = new String[10];
    private String[] aClass = new String[10];
    private String[] bClass = new String[10];
    Seat(){
        for(int i=0;i<10;i++){
            sClass[i] = "---";
            aClass[i] = "---";
            bClass[i] = "---";
        }
    }
    //num은 좌석번호 배열은 0~9니까 num-1위치에 name 저장
    public void setsSeat(int num, String name){
        sClass[num-1] = name;
    }
    public void setaSeat(int num, String name){
        aClass[num-1] = name;
    }
    public void setbSeat(int num, String name){
        bClass[num-1] = name;
    }
    public void showsSeat(){
        System.out.print("S>> ");
        for(int i=0;i<10;i++){
            System.out.print(sClass[i]);
            if(i<9) System.out.print(" ");
        }
        System.out.println();
    }
    public void showaSeat(){
        System.out.print("A>> ");
        for(int i=0;i<10;i++){
            System.out.print(aClass[i]);
            if(i<9) System.out.print(" ");
        }
        System.out.println();
    }
    public void showbSeat(){
        System.out.print("B>> ");
        for(int i=0;i<10;i++){
            System.out.print(bClass[i]);
            if(i<9) System.out.print(" ");
        }
        System.out.println();
    }
    public void cancelSeat(int select, String name){
        switch(select){
        case 1:
            for(int i=0;i<10;i++){
                if(sClass[i].equals(name))
                    sClass[i] = "---";
            }
            break;
        case 2:
            for(int i=0;i<10;i++){
                if(aClass[i].equals(name))
                    aClass[i] = "---";
            }
            break;
        case 3:
            for(int i=0;i<10;i++){
                if(bClass[i].equals(name))
                    bClass[i] = "---";
            }
            break;
        }
    }
}