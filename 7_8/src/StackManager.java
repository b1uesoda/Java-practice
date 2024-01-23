import java.util.*;

public class StackManager {
    private static HashMap<String, Integer> hm = new HashMap<>();

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("** ����Ʈ ���� ���α׷��Դϴ�. **");

        while (true) {
            System.out.print("�̸��� ����Ʈ �Է� >> ");
            String name = scanner.next();
            if (name.equals("�׸�")) break;
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
