import java.util.*;

public class LocationManager {
    private HashMap<String, Location> info;

    public LocationManager() {
        info = new HashMap<String, Location>();
    }

    public void addLocation(String name, int longitude, int latitude) {
        Location location = new Location(name, longitude, latitude);
        info.put(name, location);
    }

    public Location getLocation(String name) {
        return info.get(name);
    }

    public void printAllLocations() {
        Set<String> key = info.keySet();
        Iterator<String> it = key.iterator();
        System.out.println("---------------------------");
        while (it.hasNext()) {
            String locationName = it.next();
            Location location = info.get(locationName);
            System.out.print(location.getName() + " ");
            System.out.print(location.getLongitude() + " ");
            System.out.println(location.getLatitude() + " ");
        }
        System.out.println("---------------------------");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocationManager locationManager = new LocationManager();

        System.out.println("����, �浵, ������ �Է��ϼ���.");

        for (int i = 0; i < 4; i++) {
            System.out.print(">> ");
            String text = sc.nextLine();
            StringTokenizer st = new StringTokenizer(text, ",");
            String name = st.nextToken().trim();
            int longitude = Integer.parseInt(st.nextToken().trim());
            int latitude = Integer.parseInt(st.nextToken().trim());

            locationManager.addLocation(name, longitude, latitude);
        }

        locationManager.printAllLocations();

        while (true) {
            System.out.print("���� �̸� >> ");
            String name = sc.nextLine();
            if (name.equals("�׸�")) break;

            Location location = locationManager.getLocation(name);
            if (location == null) {
                System.out.println(name + "�� �����ϴ�.");
            } else {
                System.out.print(location.getName() + " ");
                System.out.print(location.getLongitude() + " ");
                System.out.println(location.getLatitude());
            }
        }
        sc.close();
    }
}
