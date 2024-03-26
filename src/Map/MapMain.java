package Map;

public class MapMain {
    public static void main(String[] args) {

        MyMap<String, Integer> m = new MyMap<>();

        m.put("ken", 20);
        m.put("mau", 21);
        m.put("serg", 11);
        m.put("jorz", 52);

        m.printMap();

        m.put("ken", 55);

        m.printMap();

        System.out.println(m.get("serg") + "\n");


        System.out.println(m.remove("mau"));

        m.printMap();
    }
}
