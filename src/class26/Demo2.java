package class26;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Character> arrayList = new ArrayList<>();
        arrayList.add('A');
        arrayList.add('B');  // adds the element to an arrayList
        arrayList.add('C');
        arrayList.add('D');
        System.out.println(arrayList);
        System.out.println(arrayList.get(2));

        for (int i=0; i< arrayList.size(); i++){
            System.out.print(arrayList.get(i)+" ");
        }
    }
}
