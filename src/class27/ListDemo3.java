package class27;

import java.util.ArrayList;

public class ListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> legends= new ArrayList<>();
        legends.add("Hamid");
        legends.add("Karla");
        legends.add("Naveed");
        legends.add("Tara");
        legends.add("Yusuf");
        legends.add("Yusuf");
        legends.add("Yusuf");
        legends.add("Herbert");
        legends.add("Herbert");

        System.out.println(legends.get(4));
        System.out.println(legends.get(2));
        System.out.println(legends);
        legends.set(0,"Hamid Jan");
        System.out.println(legends);
        System.out.println(legends.indexOf("Naveed"));
        System.out.println(legends.lastIndexOf("Yusuf"));
        System.out.println(legends.subList(0,3));
    }
}
