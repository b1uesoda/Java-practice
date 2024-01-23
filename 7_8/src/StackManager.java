import java.util.*;

public class StackManager {
    private static HashMap<String, Integer> hm = new HashMap<>();

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("** 포인트 관리 프로그램입니다. **");

        while (true) {
            System.out.print("이름과 포인트 입력 >> ");
            String name = scanner.next();
            if (name.equals("그만")) break;
            int score = scanner.nextInt();
            if (hm.get(name) == null) {
                hm.put(name, score);
            } else {
                hm.put(name, score + hm.get(name));
            }
            CollectionsEx.displayPoints(hm);
        }
    }
}
