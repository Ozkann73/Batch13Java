package class27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Bro");
        names.add("Abdul");
        names.add("Mumtaz");
        names.add("Zameer");
        names.add("Cindy");
/*
        for (String name : names){
            names.remove(name);
        }*/
        Iterator<String>iterator =names.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
