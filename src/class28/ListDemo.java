package class28;

public class ListDemo {
    public static void main(String[] args) {
        Object [] arr ={"Hamid",10.2, "Name"};

        for (Object obj :  arr){
            if (obj instanceof  String){
                System.out.println(((String) obj).length());
            }
        }
    }
}
