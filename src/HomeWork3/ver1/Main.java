package HomeWork3.ver1;

public class Main {
    public static void main(String[] args) {
        ReversingLinkedList reversingLinkedList = new ReversingLinkedList();

        HomeWork3.ver1.List list = new List();
        list.add(10);
        list.add(20);
        list.add(30);

        list.print();
        System.out.println("================================");
        System.out.println(reversingLinkedList.reverse().toString());
        reversingLinkedList.reverse();









    }
}


